package aaa;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class myAOP {
    @Before(value="execution(public int aaa.Car.getSum(int,int))")
    public static void f1(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature(); //得到方法签名
        Object[] args = joinPoint.getArgs();      //得到参数信息
        System.out.println("方法开始执行-日志-方法名"+signature.getName());
    }
    public static void after(Method method,Object result){
        System.out.println("方法结束执行-日志-方法名"+method.getName()+
                "结果"+ result);
    }
    public static void exception(){
        System.out.println("方法发生异常");
    }
    public static void end(){
        System.out.println("方法最终结束");
    }
}
