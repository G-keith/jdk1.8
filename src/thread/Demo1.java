package thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-22
 */
public class Demo1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Callable callable = () -> "个人博客：sunfusheng.com";
//        //System.out.println(callable.call());//获取返回结果
//        FutureTask task = new FutureTask(callable);
//
//        Thread t = new Thread(task);
//        t.start(); // 启动线程
//        System.out.println(task.get());
//        // 取消线程
//        task.cancel(true);
//        System.out.println(task.isCancelled());
//        System.out.println(task.isDone());
        //使用 guava 开源框架的 ThreadFactoryBuilder 给线程池的线程设置名字
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-thread-%d").build();

        ExecutorService pool = new ThreadPoolExecutor(10, 11, 0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(10),
                namedThreadFactory,
                new ThreadPoolExecutor.AbortPolicy());

            pool.execute(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"_"+"0");
            });

        pool.execute(() ->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"_"+"1");
        });
        pool.shutdown();
    }
}
