package lagou.theadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateFixThreadPool {
    public static void main(String[] args) throws InterruptedException {
        // 创建单线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i <= 5; i++) {
            int taskId = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程：" + Thread.currentThread().getName() + ", taskId: " + taskId);
                }
            });
            Thread.sleep(1000);
        }
    }
}
