package lagou.classloader;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        DiskClassLoader diskClassLoader = new DiskClassLoader("file:///home/leslie/Leslie/app/Leetcode/src/lagou/classloader/");
        try {
            Class c = diskClassLoader.loadClass("Test");
            if (c != null) {
                Object o = c.newInstance();
                Method printTest = c.getDeclaredMethod("printTest", null);
                printTest.invoke(o, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
