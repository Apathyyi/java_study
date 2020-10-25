package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
        Animal animalDog = new Dog();
        System.out.println("抽象类引用指向子类");
        animalDog.bark();
        Animal animalCat = new Cat();
        animalCat.bark();
        Dog dog = new Dog();
        dog.setName("DOG");
        dog.bark();
        Cat cat = new Cat("CAT");
        cat.bark();
        System.out.println("多态调用");
        Animal animalJinMao = new JinMao("JINMAO","12");
        animalJinMao.bark();
        System.out.println("类初始化顺序");
        FatherClass g = new ChildClass();
        System.out.println(">>>>>>>>>");
        FatherClass g2 = new ChildClass();
        System.out.println("接口调用");
        IEat iEat = new DarkEat();
        iEat.eat("鸭子吃鱼");
        IEat iEat1 = new FishEat("鱼喝水");
        iEat1.eat();
        Fly fly = new DarkEat();
        fly.fly();
    }
}
