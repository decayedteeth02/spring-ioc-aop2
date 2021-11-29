package cn.ioc.aop2.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Aspect//标记为切面
@Component//标记为主键
public class LogAspect2 {

    //可以采用声明切点的方式，让其他通知引用，更强使用性
    @Pointcut("execution(* cn.ioc.aop2.service.Impl.*.*(..))")
    public void poingcut() {

    }
    //前置通知
 //   @Before("poingcut() && @annotation(java.lang.Override)")
    public void before(JoinPoint joinPoint){
        //获取方法名
        String methodName = joinPoint.getSignature().getName();
        //所有的参数
        Object[] args = joinPoint.getArgs();
        System.out.println(methodName+"方法运行,参数是"+ Arrays.asList(args));
    }

    //后置通知
  //  @After("poingcut()")
    public void after(){
        System.out.println("后置通知");
    }

 //   @AfterThrowing(value = "execution(* cn.ioc.aop2.service.Impl.*.*(..))",throwing = "ex")
    public void afterthrowing(Exception ex){
        StringWriter sw=new StringWriter();
        ex.printStackTrace(new PrintWriter(sw,true));
        System.out.println("后置错误通知"+sw.getBuffer().toString());
    }

  //  @AfterReturning(value = "execution(* cn.ioc.aop2.service.Impl.*.*(..))",returning = "returnValue")
    public void afterreturning(Object returnValue){
        System.out.println("后置值"+returnValue);
    }


//    @Around("poingcut()")
//    public Object arround(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        //所有的参数
//        Object[] args = joinPoint.getArgs();
//
//        Object returnValue="";
//
//        try {
//            System.out.println("环绕：前置通知"+methodName+"方法执行"+Arrays.asList(args));
//            joinPoint.proceed();
//            System.out.println("后置通知"+methodName+"方法执行"+Arrays.asList(args));
//        }catch (Throwable throwable){
//            System.out.println("异常通知"+throwable);
//
//        }finally {
//            System.out.println("返回通知"+returnValue);
//        }
//        return returnValue;
//    }


}
