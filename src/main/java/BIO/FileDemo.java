package BIO;

import java.io.FileOutputStream;

public class FileDemo {
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Kssn\\Desktop\\a.txt");

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<500;i++) sb.append("aaaaa");
        String str = sb.toString();
        fileOutputStream.write(str.getBytes());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
