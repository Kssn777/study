package RPC.Client;

import RPC.Server.User;
import RPC.UserApi;

/**
 * @author lrh
 * @description
 * @date 2022/8/4
 */
public class rpcClient {
    public static void main(String[] args) {
        UserApi userApi = (UserApi) RPCUtil.call(UserApi.class);
        User user = userApi.getUser();
        System.out.println(user);
    }



}
