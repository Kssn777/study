package MyServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9847);

        while(true){
            Socket socket = serverSocket.accept();
            System.out.println("远程主机地址: " + socket.getRemoteSocketAddress());
            BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            InputStream in = socket.getInputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            OutputStream out = socket.getOutputStream();
            String msg = null;
            byte[] r = new byte[in.available()];
            int l = 0;
            in.read(r);
            System.out.println(new String(r));
            System.out.println("------------------------------------------------");
            String s = "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/html\r\n" +
                    "\r\n";
            StringBuilder sb = new StringBuilder(s);
            FileInputStream fin = new FileInputStream(new File(new test11().getClass().getClassLoader().getResource("index.html").getPath()));
            int len = 0;
            byte[] bf = new byte[fin.available()];


            while((len = fin.read(bf))!=-1){
                sb.append(new String(bf,0,len));
            }

            //System.out.println(sb);

            out.write(sb.toString().getBytes());
            //writer.flush();
            out.close();
            socket.close();


        }
    }
}
