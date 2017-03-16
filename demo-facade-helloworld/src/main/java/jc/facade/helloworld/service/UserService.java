package jc.facade.helloworld.service;

import jc.facade.helloworld.entity.User;

/**
 * Created by liaojiacan on 2017/3/15.
 */
public interface UserService {
    User getUser(String username);
}
