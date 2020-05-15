package nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Optional;

/**
 * 通道：负责缓冲区中数据传输，不能直接读取数据
 *
 * @author keith
 * @version 1.0
 * @date 2020-05-15
 **/
public class TestChannel {

    /**
     *  FileChannel:用于读取、写入、映射和操作文件的通道。
     * DatagramChannel:通过UDP读写网络中的数据通道。
     * SocketChannel:通过tcp读写网络中的数据。
     * ServerSocketChannel:可以监听新进来的tcp连接，对每一个连接都创建一个SocketChannel。
     * <p>
     * 通过getChannel()方法获取
     * 前提是该类支持该方法。支持该类的方法有：
     * 本地io：FileInputStream/FileOutputStream，RandomAccessFile
     * 网络io：Socket，ServerSocket ，DatagramSocket
     * <p>
     * JDK1,7:
     * 通过静态方法open()
     * 通过Files的newByteChannel()方法
     */

    public static void main(String[] args) throws IOException {

        testCharset();
    }

    /**
     * 文件复制/非直接缓冲区
     */
    public static void testCopy() {
        String path=System.getProperty("user.dir");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel inchannel = null;
        FileChannel outchannel = null;
        try {
            fis = new FileInputStream("E:\\photo\\success.png");
            fos = new FileOutputStream("E:\\photo\\fail.png");

            //获取通道
            inchannel = fis.getChannel();
            outchannel = fos.getChannel();

            //分配指定大小缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            //将通道数据写入缓冲区
            while (inchannel.read(buffer) != -1) {
                //将缓冲区数据写入通道
                buffer.flip();//对于缓冲区来说是读数据模式
                outchannel.write(buffer);
                buffer.clear();//情况缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (Optional.ofNullable(outchannel).isPresent()) {
                try {
                    outchannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (Optional.ofNullable(inchannel).isPresent()) {
                try {
                    inchannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (Optional.ofNullable(fis).isPresent()) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (Optional.ofNullable(fos).isPresent()) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    /**
     * 文件复制-直接缓冲区/内存映射文件
     */
    public static void testCopy2() throws IOException {
        FileChannel inChannel=FileChannel.open(Paths.get("E:\\photo\\test.jpg"), StandardOpenOption.READ);
        FileChannel outChannel=FileChannel.open(Paths.get("E:\\photo\\fail.jpg"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);

        //内存映射文件
        MappedByteBuffer inByteBuffer=inChannel.map(FileChannel.MapMode.READ_ONLY,0,inChannel.size());
        MappedByteBuffer outByteBuffer=outChannel.map(FileChannel.MapMode.READ_WRITE,0,inChannel.size());

        byte[] data=new byte[inByteBuffer.limit()];
        //将数据读入字节数组
        inByteBuffer.get(data);
        //写入管道
        outByteBuffer.put(data);
        inChannel.close();
        outChannel.close();
    }

    /**
     * 文件复制-直接缓冲区/通道传输数据
     */
    public static void testCopy3() throws IOException {
        FileChannel inChannel=FileChannel.open(Paths.get("E:\\photo\\test.jpg"), StandardOpenOption.READ);
        FileChannel outChannel=FileChannel.open(Paths.get("E:\\photo\\fail.jpg"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);
        //transferTo和transferFrom内部实现了缓冲区，所以数据还是通过缓冲区来完成的。
        //去哪里
        //inChannel.transferTo(0,inChannel.size(),outChannel);
        //从哪里来
        outChannel.transferFrom(inChannel,0,inChannel.size());
        inChannel.close();
        outChannel.close();
    }

    /**
     * 分散读取：是指读取一个Channel的数据到多个buffer中，注意是依次填满每个缓冲区，直到没有数据了；
     * 聚集写入：是指将多个buffer的内容依次写入到通道中
     */
    public static void testCopy4() throws IOException {
        RandomAccessFile randomAccessFile=new RandomAccessFile("E:\\photo\\work.txt", "rw");
        //获取通道
        FileChannel channel=randomAccessFile.getChannel();
        //分配指定大小缓冲区  这里指定两个大小不一样的缓冲区
        ByteBuffer buf1=ByteBuffer.allocate(100);
        ByteBuffer buf2=ByteBuffer.allocate(4096);
        ByteBuffer[] buf={buf1,buf2};
        channel.read(buf);
        for (ByteBuffer byteBuffer : buf) {
            byteBuffer.flip();     ////对于缓冲区来说是读数据模式, 开启读模式
        }
        //打印buf1的内容
        System.out.println(new String(buf[0].array(),0,buf[0].limit()));
        //打印buf2的内容
        System.out.println(new String(buf[1].array(),0,buf[1].limit()));
        //聚集写入
        RandomAccessFile randFile=new RandomAccessFile("E:\\photo\\work2.txt", "rw");
        FileChannel fileChannel=randFile.getChannel();
        fileChannel.write(buf);
    }

    /**
     * 字符集
     */
    public static void testCharset() throws CharacterCodingException {
        Charset charset=Charset.forName("GBK");

        //获取编码器
        CharsetEncoder cn=charset.newEncoder();

        //获取解码器
        CharsetDecoder cd=charset.newDecoder();

        CharBuffer charBuffer=CharBuffer.allocate(1024);
        charBuffer.put("测试");
        charBuffer.flip();
        //编码
        ByteBuffer buffer=cn.encode(charBuffer);
        for (int i = 0; i < 4; i++) {
            buffer.get();
        }
        //解码
        buffer.flip();
        CharBuffer decode=cd.decode(buffer);
        System.out.println(decode.toString());
    }
}
