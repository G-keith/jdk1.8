package nio;

import javax.print.DocFlavor;
import java.nio.ByteBuffer;

/**
 * 负责数据的存取，本质上就是数组，用于存储不同类型的数据
 * 根据数据类型不同，提供不同类型的缓冲区
 * @author keith
 * @version 1.0
 * @date 2020-05-14
 **/
public class TestBuffer {

    public static void main(String[] args) {
        testByteBuffer2();
    }

    public static void testByteBuffer(){
        //分配一个指定大小的缓冲区
        ByteBuffer buffer=ByteBuffer.allocate(1024);

        System.out.println(buffer.capacity());
        System.out.println(buffer.limit());
        System.out.println(buffer.position());
        //写数据
        buffer.put("alibaba".getBytes());
        //切换成读模式
        buffer.flip();
        byte[] bytes=new byte[buffer.limit()];
        buffer.get(bytes);
        System.out.println(new String(bytes,0,bytes.length));
        //判断缓冲区是否有剩余的数据
        if(buffer.hasRemaining()){
            //获取缓冲区剩余可操作的数量
            System.out.println(buffer.remaining());
        }
        buffer.rewind();//重复读数据
        buffer.clear();//情况缓冲区，但是缓冲区数据依然存在，然后处于被遗忘状态

    }

    public static void testByteBuffer2(){
        //分配一个指定大小的直接缓冲区
        ByteBuffer buffer=ByteBuffer.allocateDirect(1024);
        //是否是直接缓冲区
        System.out.println(buffer.isDirect());

    }
}
