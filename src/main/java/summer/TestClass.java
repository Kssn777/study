package summer;

import summer.annotation.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestClass {
    private static Set<Class> set = new HashSet<>();
    public static void main(String[] args) throws Exception {
        TestClass x = new TestClass();

        Class<TestClass> clazz = TestClass.class;
        String packageName = clazz.getPackage().getName();
        URL url = clazz.getClassLoader().getResource(packageName);
        String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
        x.print(packageName,filePath);


    }

    public void print(String packageName,String filePath) throws ClassNotFoundException {
        if(packageName.length()>0){
            packageName = packageName+".";
        }
        File dir = new File(filePath);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println(dir.getName());
            return;
        }
        File[] files = dir.listFiles((file) -> file.isDirectory() || file.getName().endsWith(".class"));
        for (File file : files) {
            if(file.isDirectory()){
                print(packageName + file.getName(),file.getAbsolutePath());
            }else {
                String name = file.getName().substring(0,file.getName().length()-6);
                set.add(Thread.currentThread().getContextClassLoader().loadClass(packageName+name));
                Class<?> now = Thread.currentThread().getContextClassLoader().loadClass(packageName + name);
                if(now.isAnnotationPresent(Test.class)){
                    System.out.println(now.getName());
                }
            }
        }

    }
}
