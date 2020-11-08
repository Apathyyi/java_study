package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpringApplication.run(DemoApplication.class, args);
        String[] kgc = {"C#编程","JAVA编程","汇编编程"};
        try {
            System.out.println("请输入课程代号（1~3之间的数字）：");
            int num = sc.nextInt();
            System.out.println(kgc[num-1]);
        }catch(InputMismatchException e) {
            System.out.println("你输入的不是数字");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("你输入的数字不在范围之内");
        }finally {
            System.out.println("欢迎提出建议");
        }
    }
    public static int  m2(){
        int i = 10;
        try{
            i = 20;
            //System.out.println(i/0);
            return i;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            i = 30;
            System.out.println("执行finally");
        }
        return i;
    }
    public class LessMoneyException extends Exception{
        public LessMoneyException() {
        }

        public LessMoneyException(String msg){
            super(msg);
        }
    }
    public class Account {
        private double cash;

        public Account(double cash) {
            this.cash = cash;
        }

        /**
         * 执行转账逻辑，并抛出有可能出现的余额不足异常
         */
        public void changeOut(Account c,double money) throws LessMoneyException{
            if(this.cash >= money){
                //目标账号金额增加
                c.cash = c.cash + money;
                //当前账户金额减少
                this.cash = this.cash - money;
            }else{
                throw new LessMoneyException("骚年，余额不足，请充值!!!");
            }
        }
    }
}

