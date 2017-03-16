package jc.client.helloworld.service.impl;

import jc.client.helloworld.thrift.client.HelloworldClientFactory;
import jc.facade.helloworld.entity.User;
import jc.facade.helloworld.service.UserService;
import jc.facade.thrift.helloworld.Helloworld;
import jc.facade.thrift.helloworld.TUser;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by liaojiacan on 2017/3/16.
 */
public class UserServiceThriftImpl implements UserService {


    @Override
    public User getUser(String username) {

        try {
            Helloworld.Client client = HelloworldClientFactory.createHelloworldClient("localhost", 9090);
            TUser tUser = client.getUser(username);
            User user = new User();
            BeanUtils.copyProperties(user,tUser);
            return user;
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
