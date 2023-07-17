package rocketMQ;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

import java.util.concurrent.TimeUnit;

public class AsyncProducer {
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
            Message msg = new Message("myTopic", "myTag", body);
            producer.send(msg, new SendCallback() {
                //当producer接收到MQ发送来的ACK后就会触发该回调方法执行
                @Override
                public void onSuccess(SendResult sendResult) {
                    System.out.println(sendResult);
                }

                @Override
                public void onException(Throwable e) {
                    e.printStackTrace();
                }
            });
        }
        //要sleep一会，因为是异步发送的，不然很容易丢失捏
        TimeUnit.SECONDS.sleep(3);
        //关闭   生产环境下不注释，注释的话就会在检测中心上删除掉该生产者组
        /*producer.shutdown();*/
    }
}
