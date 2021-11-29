package cn.apo2.tests;

import cn.ioc.aop2.entity.User;
import cn.ioc.aop2.service.IUserservice;
import cn.ioc.aop2.service.Impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("classpath:/spring.xml");
        IUserservice bean =ioc.getBean(IUserservice.class);
//        System.out.println(bean.getClass());
        //在没有使用AOP的情况下 class cn.ioc.aop2.service.Impl.UserServiceImpl
        //使用了AOP的情况下 class com.sun.proxy.$Proxy20 jdk代理产生的一个动态代理类
        //在没有实现接口的情况下 class cn.ioc.aop2.service.Impl.UserServiceImpl$$EnhancerBySpringCGLIB$$ee506f3a
        //没有实现代理的类就会用cglib代理
//        bean.add(new User());
        bean.select(1);


    }
}
