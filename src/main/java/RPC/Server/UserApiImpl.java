package RPC.Server;

import RPC.UserApi;

/**
 * @author lrh
 * @description
 * @date 2022/8/4
 */
public class UserApiImpl implements UserApi {
    @Override
    public User getUser() {
        User user = new User();
        user.setAge(18);
        user.setName("小明");
        return user;
    }
}
