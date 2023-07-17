package UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class client1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        System.out.println(InetAddress.getLocalHost().getHostName());
        while((msg = reader.readLine())!=null){
            if(msg.equals("886")){
                break;
            }
            byte[] buf = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buf,buf.length, InetAddress.getByName(InetAddress.getLocalHost().getHostName()),12345);
            socket.send(packet);
        }

    }
}
