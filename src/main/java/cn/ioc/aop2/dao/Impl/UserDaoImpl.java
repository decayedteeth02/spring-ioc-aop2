package cn.ioc.aop2.dao.Impl;

import cn.ioc.aop2.dao.IUserDao;
import cn.ioc.aop2.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

    @Override
    public User select(Integer id) throws Exception {
        if (id==null){
            throw new Exception("ID不能为空");
        }
        return new User();
    }

    @Override
    public void add(User user) throws Exception {
        if (user==null){
            throw new Exception("User不能为null");
        }
    }

    @Override
    public void update(User user) throws Exception {
        if (user==null){
            throw new Exception("User不能为null");
        }
    }

    @Override
    public void delete(Integer id) throws Exception {
        if (id==null){
            throw new Exception("Id不能为null");
        }
    }
}
