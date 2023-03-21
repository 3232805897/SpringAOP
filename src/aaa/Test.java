package aaa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("bean4.xml");
        Car car = ioc.getBean(Car.class);
        int sum = car.getSum(99, 99);
        System.out.println(sum);
    }
}
