package MyServer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test11 {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream(new File(new test11().getClass().getClassLoader().getResource("index.html").getPath()));
        int len = 0;
        byte[] bf = new byte[1024];

        while((len = fin.read(bf))!=-1){
            System.out.println(new String(bf,0,len));
        }
    }
}
