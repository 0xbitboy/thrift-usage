package jc.provider.helloworld.thrift.impl;

import jc.facade.helloworld.entity.User;
import jc.facade.helloworld.service.UserService;
import jc.facade.thrift.helloworld.Helloworld;
import jc.facade.thrift.helloworld.TUser;
import jc.service.helloworld.service.impl.UserServiceImpl;
import org.apache.thrift.TException;

/**
 * Created by liaojiacan on 2017/3/16.
 */
public class HelloworldImpl implements Helloworld.Iface{

    private UserService userService ;

    public HelloworldImpl() {
        userService = new UserServiceImpl();
    }

    @Override
    public TUser getUser(String username) throws TException {
        TUser tUser = new TUser();
        User user = userService.getUser(username);
        tUser.setNickname(user.getNickname());
        tUser.setUsername(user.getUsername());
        tUser.setAge(user.getAge());
        return tUser;
    }
}
