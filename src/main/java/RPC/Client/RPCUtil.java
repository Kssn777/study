package RPC.Client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * @author lrh
 * @description
 * @date 2022/8/4
 */
public class RPCUtil {
    public static Object call(Class clazz){
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Socket socket=new Socket("127.0.0.1",9898);
                String className = clazz.getName();//api类名
                String  methodName=method.getName();//api 类成员方法名
                Class<?>[] parameterTypes=method.getParameterTypes(); //类成员方法参数类型集合

                ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeUTF(className);
                objectOutputStream.writeUTF(methodName);
                objectOutputStream.writeObject(parameterTypes);
                objectOutputStream.writeObject(args);

                ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
                Object o = objectInputStream.readObject();
                objectInputStream.close();
                objectOutputStream.close();
                return o;

            }
        });
    }
}
