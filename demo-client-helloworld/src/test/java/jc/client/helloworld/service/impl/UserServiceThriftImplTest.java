package jc.client.helloworld.service.impl;


import jc.facade.helloworld.service.UserService;

/**
 * Created by liaojiacan on 2017/3/16.
 */
public class UserServiceThriftImplTest {
    @org.junit.Test
    public void getUser() throws Exception {


        UserService userService = new UserServiceThriftImpl();

        System.out.println(userService.getUser("liaojiacan"));

    }

}