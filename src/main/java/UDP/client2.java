package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class client2 {
    public static void main(String[] args) throws IOException, InterruptedException {


        new Thread(()->{
            System.out.println("开启UDP接收线程。。。。");
            DatagramSocket socket = null;
            try {
                socket = new DatagramSocket(12345);
            } catch (SocketException e) {
                e.printStackTrace();
            }
            while(true){
                byte[] buf = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buf,buf.length);
                try {
                    socket.receive(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("UDP包数据：" + new String(packet.getData(),0,packet.getLength()));
            }

        }).start();

        for(int i=0;i<1000;i++){
            System.out.println("主线程。。。。");
            Thread.sleep(1000);
        }

    }
}
