package BIO;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyServer {
    private ServerSocket serverSocket;


    public MyServer(){}
    public MyServer(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
    }


    public void start()  {
        ExecutorService pool = Executors.newCachedThreadPool();
        System.out.println("服务器启动");
        while(true){
            try{
                Socket socket = serverSocket.accept();
                pool.execute(()->handle(socket));
            }catch (Exception e){
                pool.shutdown();
                System.exit(-1);
            }

        }


    }

    private void handle(Socket socket) {
        System.out.println("客户端连接成功------> " + socket.getInetAddress().toString());
        InputStream in = null;
        OutputStream out = null;
        try{
            byte[] buf = new byte[1024];
            int read;
                in = socket.getInputStream();
                out = socket.getOutputStream();
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Kssn\\Desktop\\1.jpg");
            byte[] b = new byte[1024];
            int l;
            while((read = in.read(buf)) != -1) {

                    out.write(("HTTP/1.1 200 OK\r\n"
                            +"Content-Type: multipart/form-data\r\n"
                            +"Content-Disposition: attachment;fileName=test.jpg\r\n"
                            + "\r\n"
                            ).getBytes()) ;
                    while((l=fileInputStream.read(b))!=-1){
                        out.write(b,0,l);
                    }

                    /*MyResponse res = new MyResponse();
                    res.ok().setHeader("Content-Type","multipart/form-data")
                            .setMessage(fileInputStream.readAllBytes());
                    out.write(res.getResult());
                    fileInputStream.close();*/
                    socket.shutdownInput();
                    socket.shutdownOutput();
                    /*out.write(msg.getBytes());*/

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
