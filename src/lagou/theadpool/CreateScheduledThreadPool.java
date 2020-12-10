package lagou.theadpool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CreateScheduledThreadPool {
    public static void main(String[] args) throws InterruptedException {
        // 创建单线程池
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                System.out.println("线程：" + Thread.currentThread().getName() + ", " + date);
            }
        }, 500, 500, TimeUnit.MILLISECONDS);
        Thread.sleep(5000);
        executorService.shutdown();
    }
}
