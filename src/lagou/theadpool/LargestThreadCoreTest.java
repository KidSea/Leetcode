package lagou.theadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class LargestThreadCoreTest {
    public static void main(String[] args) throws InterruptedException {
        // 创建单线程池
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        for (int i = 0; i <= 5; i++) {
            int taskId = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("线程：" + Thread.currentThread().getName() + ", taskId: " + taskId);
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            System.out.println("队列：" + executorService.getQueue().size() + " 个元素");
            Thread.sleep(500);
        }
        executorService.shutdown();
    }
}
