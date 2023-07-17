package RPC.Server;

import RPC.UserApi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lrh
 * @description
 * @date 2022/8/4
 */
public class rpcServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9898);
            while(true){
                Socket socket = serverSocket.accept();
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                //读取客户端传输协议包
                String className=in.readUTF();
                String methodName=in.readUTF();
                Class<?>[] parameterTypes=(Class<?>[])in.readObject();
                Object[] arguments= (Object[]) in.readObject();

                Class clazz=null;
                //服务注册：API到具体实现的映射
                if(className.equals(UserApi.class.getName())){
                    clazz=UserApiImpl.class;
                }
                //传入方法名，方法参数类型获得方法对象
                Method method=clazz.getMethod(methodName,parameterTypes);
                //传入实现类对象，方法参数数组，方法对象执行获得返回结果对象
                Object result=method.invoke(clazz.getConstructor().newInstance(),arguments);

                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeObject(result);
                objectOutputStream.flush();

                in.close();
                objectOutputStream.close();
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
