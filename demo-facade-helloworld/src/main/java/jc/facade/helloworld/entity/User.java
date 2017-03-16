package jc.facade.helloworld.entity;

/**
 * Created by liaojiacan on 2017/3/15.
 */
public class User {
    private String username;
    private String nickname;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "username:"+username+",nickname:"+nickname+",age:"+age;
    }
}
