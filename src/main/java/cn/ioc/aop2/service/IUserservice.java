package cn.ioc.aop2.service;

import cn.ioc.aop2.entity.User;

public interface IUserservice {
    User select(Integer id) throws Exception;
    void add(User user) throws Exception;
    void update(User user) throws Exception;
    void delete(Integer id) throws Exception;
}
