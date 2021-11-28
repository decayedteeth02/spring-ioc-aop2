package cn.ioc.aop2.service.Impl;

import cn.ioc.aop2.dao.IUserDao;
import cn.ioc.aop2.entity.User;
import cn.ioc.aop2.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class UserServiceImpl implements IUserservice {
    @Autowired
    IUserDao userDao;
    @Override
    public User select(Integer id) throws Exception {
        System.out.println("查询User");
        return userDao.select(id);
    }


    public void add(User user) throws Exception {
        System.out.println("增加");
        userDao.add(user);
    }


    public void update(User user) throws Exception {
        System.out.println("修改");
        userDao.update(user);
    }


    public void delete(Integer id) throws Exception {
        System.out.println("删除");
        userDao.delete(id);
    }
}
