package com.example.demo;

/**
 * @author sy
 * @date 2020/10/25 17:19
 */
class FatherClass {

    public FatherClass(){
        System.out.println("父类构造函数");
    }
    static{
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类代码块");
    }

}