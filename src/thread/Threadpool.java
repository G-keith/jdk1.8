package thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-12
 */
public class Threadpool {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
            // 提交多个线程任务，并执行
         threadPool.execute(() -> System.out.println(Thread.currentThread().getName() + " is running .."));
        ScheduledExecutorService scheduledThreadPool= Executors.newScheduledThreadPool(3);

        // new ScheduledThreadPoolExecutor(3,new ThreadFactoryBuilder().setNameFormat("定时线程池").build());
        scheduledThreadPool.schedule(() -> System.out.println("延迟三秒"), 3, TimeUnit.SECONDS);
        scheduledThreadPool.scheduleAtFixedRate(() -> System.out.println("延迟 1 秒后每三秒执行一次"),1,3,TimeUnit.SECONDS);

        //创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。对于执行
        //很多短期异步任务的程序而言，这些线程池通常可提高程序性能。调用 execute 将重用以前构造
        //的线程（如果线程可用）。如果现有线程没有可用的，则创建一个新线程并添加到池中。终止并
        //从缓存中移除那些已有 60 秒钟未被使用的线程。因此，长时间保持空闲的线程池不会使用任何资
        //源。
        ExecutorService cachePool=Executors.newCachedThreadPool();

        //创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。在任意点，在大
        //多数 nThreads 线程会处于处理任务的活动状态。如果在所有线程处于活动状态时提交附加任务，
        //则在有可用线程之前，附加任务将在队列中等待。如果在关闭前的执行期间由于失败而导致任何
        //线程终止，那么一个新线程将代替它执行后续的任务（如果需要）。在某个线程被显式地关闭之
        //前，池中的线程将一直存在。
        ExecutorService fixedPool=Executors.newFixedThreadPool(2);

        //返回一个线程池（这个线程池只有一个线程）,这个线程
        //池可以在线程死后（或发生异常时）重新启动一个线程来替代原来的线程继续执行下去！
        ExecutorService newSinglePool=Executors.newSingleThreadExecutor();

        //ThreadPoolExecutor参数意思
        /**
         * corePoolSize： 线程池里最小线程数
         *  maximumPoolSize：线程池里最大线程数量，超过最大线程时候会使用 RejectedExecutionHandler
         *  keepAliveTime：线程最大的存活时间，超过这个时间就会被回收
         *  unit：线程最大的存活时间的单位
         *  workQueue：缓存需要执行的异步任务的队列
         *  threadFactory：新建线程工厂
         *  handler：拒绝策略，表示当workQueue已满，且池中的线程数达到maximumPoolSize时，线程池拒绝添加新任务时采取的策略。
         *          DiscardPolicy：抛弃当前任务，DiscardOldestPolicy：扔掉最旧的，
         *          CallerRunsPolicy：由向线程池提交任务的线程来执行该任务，
         *          AbortPolicy：抛出 RejectedExecutionException 异常。
         */

        }
}
