package com.mic.boot.common;

import java.util.List;

public interface IDao<T> {

    public void add(T t);

    public void update(T t);

    public void delete(long id);

    public List<T> queryAll();

    public T queryById(long id);

}
