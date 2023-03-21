package aaa;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public int getSum(int a, int b) {
        int result = a+b;
        System.out.println("内部计算"+result);
        return result;
    }

    @Override
    public int getSub(int a, int b) {
        int result = a-b;
        System.out.println("内部计算"+result);
        return result;
    }
}
