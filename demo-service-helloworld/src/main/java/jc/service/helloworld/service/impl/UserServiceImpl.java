package jc.service.helloworld.service.impl;

import jc.facade.helloworld.entity.User;
import jc.facade.helloworld.service.UserService;

/**
 * Created by liaojiacan on 2017/3/15.
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String username) {
        User user= new User();
        user.setAge(24);
        user.setUsername("liaojiacan");
        user.setNickname("炎苛");
        return user;
    }
}
