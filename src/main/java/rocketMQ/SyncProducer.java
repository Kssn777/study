package rocketMQ;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

public class SyncProducer {
    public static void main(String[] args) throws Exception{
        //参数为Producer Group名称
        DefaultMQProducer producer = new DefaultMQProducer("t1");
        //指定Name Server的地址
        producer.setNamesrvAddr("192.168.70.128:9876");
        //开启生产者
        producer.start();

        //生产并且发送100条消息
        for (int i=0;i<100;i++){
            byte[] body = ("Hi," + i).getBytes();
            Message msg = new Message("someTopic", "someTag", body);
            SendResult result = producer.send(msg);

            System.out.println(result);
        }

        //关闭   生产环境下不注释，注释的话就会在检测中心上删除掉该生产者组
        /*producer.shutdown();*/

    }
}
