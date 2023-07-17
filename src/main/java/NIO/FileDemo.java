package NIO;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<500;i++) sb.append("aaaaa");
        String str = sb.toString();
        //创建一个输出流->channel
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Kssn\\Desktop\\a.txt");
        //通过fileOutputStream获取对应的FileChannel
        //这个fileChannel真实类型是FileChannelImpl
        FileChannel fileChannel = fileOutputStream.getChannel();
        //创建一个缓冲区ByteBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
        //将str放入byteBuffer
        byteBuffer.put(str.getBytes());
        //切换到写入模式
        byteBuffer.flip();
        //将缓冲区的数据写到通道中
        fileChannel.write(byteBuffer);
        fileOutputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
