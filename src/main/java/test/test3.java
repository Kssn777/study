package test;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class test3 {
    private static byte[] buf = new byte[1024*1024];

    static class FileThread extends Thread{
        public FileThread(String name){
            super(name);
        }
        public FileThread(){}
        @SneakyThrows
        @Override
        public void run() {
            File f = new File("C:\\Users\\Kssn\\Desktop\\a.txt");
            FileOutputStream out = null;
            try {
                out = new FileOutputStream(f,true);
                String s = Thread.currentThread().getName() + "---->" + "asdasd" + '\n';
                out.write(s.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                out.close();
            }

        }
    }

    public static void main(String[] args) {

        for(int i=0;i<buf.length;i++){
            buf[i] = (byte) ((byte)-128 + new Random().nextInt(256));
        }

        Thread h = new Thread(()->{
            File f = new File("C:\\Users\\Kssn\\Desktop\\a.txt");
            FileOutputStream out = null;
            try {
                out = new FileOutputStream(f,true);

                out.write(buf);
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        },"big");
        h.start();

        for(int i=0;i<10;i++){
            Thread t = new FileThread(String.valueOf(i));
            t.start();
        }

    }




}
