package lagou.theadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateCacheThreadPool {
    public static void main(String[] args) throws InterruptedException {
        // 创建单线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i <= 5; i++) {
            int taskId = i;
            Thread.sleep(1000);
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程：" + Thread.currentThread().getName() + ", taskId: " + taskId);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
