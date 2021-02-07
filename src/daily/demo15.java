package daily;

public class demo15 {
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        demo15 demo15 = new demo15();
        demo15.run();
    }

    public void run() {
        // 1
        threadLocal.set("hello threadlocal");
        new Thread("Thread#1") {
            @Override
            public void run() {
                // 2
                threadLocal.set("hello, " + this.getName());
                System.out.println("[Thread#1]threadLocal=" + threadLocal.get());
            };
        }.start();
        new Thread("Thread#2") {
            @Override
            public void run() {
                // 3
                System.out.println("[Thread#2]threadLocal=" + threadLocal.get());
            };
        }.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 4
        System.out.println(Thread.currentThread().getName() + "threadLocal=" + threadLocal.get());
    }
}
