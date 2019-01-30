package com.mic.boot.user.dao;

import com.mic.boot.common.IDao;

public interface IUserDao<T> extends IDao<T> {

    public T findByNameAndPasswod(String name,String password);
}
