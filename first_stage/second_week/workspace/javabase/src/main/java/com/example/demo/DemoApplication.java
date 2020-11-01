package com.example.demo;

import com.example.demo.bean.People;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {
    /* 第一个Java程序 注释使用
     * 它将打印字符串 Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // 打印 Hello World
        /**
         * 定义变量
         */
        int a;
        double b;
        float c;
        String d;
        Boolean e;
        /**
         * 变量赋值
         */
        a = 2;
        b = 3.13;
        c = 4;
        e = true;
        /**
         *构造对象
         */
        People people = new People();
        people.setName("aaa");
        people.setAge(2);
        people.setGender("man");
        /**
         * 调用成员变量和方法
         */
        System.out.println(people.name);
        people.sayHello();
        People.say();
        /**
         * 循环分支
         */
        for (int i = 0;i<6;i++){
            System.out.println(i);
        }
        int i = 4;
        while (i<8){
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(i);
            i++;
        }while (i<9);
        /**
         * 条件分支
         */
        int j = 6;
        if (j<4){
            System.out.println("j<4");
        }else if (j==6){
            System.out.println("j==6");
        }else {
            System.out.println("j>6");
        }
        /**
         * switch case
         */
        int k = 8;
        switch (k){
            case 1:
                System.out.println("k==1");
                break;
            case 2:
                System.out.println("k==2");
                break;
            case 5:
                System.out.println("k==5");
                break;
            case 8:
                System.out.println("k==8");
                break;
            default:
                System.out.println("else");
        }
        /**
         * 跳转语句
         */
        for (int x = 0;x<5;x++){
            if (x%2==0){
                continue;
            }
            x = x-1;
        }
        /**
         * java集合
         */
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        //第一种遍历方法使用 For-Each 遍历 List
        for (String str : list) {            //也可以改写 for(int i=0;i<list.size();i++) 这种形式
            System.out.println(str);
        }

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int z=0;z<strArray.length;z++) //这里也可以改写为  for(String str:strArray) 这种形式
        {
            System.out.println(strArray[z]);
        }

        //第三种遍历 使用迭代器进行相关遍历

        Iterator<String> ite=list.iterator();
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }
        SpringApplication.run(DemoApplication.class, args);
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
    }
}