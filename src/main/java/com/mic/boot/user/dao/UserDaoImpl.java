package com.mic.boot.user.dao;


import com.mic.boot.user.model.User;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class UserDaoImpl implements IUserDao<User> {

    private static List<User> users = new ArrayList<User>();

    static {
        User admin = new User("1","admin","admin");
        admin.setAvatarUrl("http://tupian.qqjay.com/tou2/2018/0414/6cf0ff2911b7c74afbc15a675eb596d2.jpg");
        admin.setBigAvatarUrl("http://pic1.win4000.com/mobile/2017-11-29/5a1e9526558bf.jpg");
        admin.setEmail("lpjhblpj@163.com");
        admin.setPhoneNUm("15313195276");
        admin.setAddress("北京市,朝阳区,浦项中心32层,208工位");
        admin.setAge("33");
        admin.setEnjoy("篮球");
        admin.setIncome("50000000");
        admin.setSex("男");
        admin.setSchool("中南林业科技大学");
        admin.setToken("IOJFOAHSFNAIOFHAOIFHJOIA");
        users.add(admin);
        users.add(new User("2","c","c"));
        users.add(new User("3","android","android"));
        users.add(new User("1","java","java"));
        users.add(new User("5","python","python"));
    }

    @Override
    public User findByNameAndPasswod(String name, String password) {

        for (User user:users) {
            if(user.name.equals(name)){
                return user;
            }
        }

        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User queryById(long id) {
        return null;
    }
}
