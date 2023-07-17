package MyServer;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("www.pconline.com.cn",80);
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        OutputStream out = s.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        StringBuffer sb = new StringBuffer("GET /index.html HTTP/1.1\r\n");
        //sb.append("User-Agent: Java/1.6.0_20\r\n");
        sb.append("Host: www.pconline.com.cn\r\n");
        sb.append("Accept: text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2\r\n");
        sb.append("Connection: Close\r\n");
        sb.append("\r\n");
        out.write(sb.toString().getBytes());
        String tmp = "";
        while((tmp = reader.readLine())!=null){
            System.out.println(tmp);
        }
        out.close();
        reader.close();

    }
}
