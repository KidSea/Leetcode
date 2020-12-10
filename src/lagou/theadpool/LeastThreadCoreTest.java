package lagou.theadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LeastThreadCoreTest {
    public static void main(String[] args) throws InterruptedException {
        // 创建单线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i <= 5; i++) {
            int taskId = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("线程：" + Thread.currentThread().getName() + ", taskId: " + taskId);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            Thread.sleep(2000);
        }
        executorService.shutdown();
    }
}
