package lagou.classloader;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DiskClassLoader extends ClassLoader {
    private String filePath;

    public DiskClassLoader(String path) {
        filePath = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String newPath = filePath + name + ".class";
        System.out.println(newPath);
        byte[] classBytes = null;
        Path path = null;
        try {
            path = Paths.get(new URI(newPath));
            classBytes = Files.readAllBytes(path);
            System.out.println(path + ", " + classBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defineClass(classBytes, 0, classBytes.length);
    }
}
