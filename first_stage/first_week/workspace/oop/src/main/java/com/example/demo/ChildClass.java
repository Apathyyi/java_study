package com.example.demo;

/**
 * @author sy
 * @date 2020/10/25 17:20
 */
public class ChildClass extends FatherClass {
    public ChildClass(){
        System.out.println("子类构造函数");
    }
    static{
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类代码块");
    }
    public static void main(String[] args) {
        FatherClass g = new ChildClass();
        System.out.println(">>>>>>>>>");
        FatherClass g2 = new ChildClass();

    }
}
