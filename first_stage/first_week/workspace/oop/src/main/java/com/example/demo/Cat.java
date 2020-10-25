package com.example.demo;

/**
 * @author sy
 * @date 2020/10/25 16:40
 */
public class Cat extends Animal {
    private String name;
    @Override
    void bark() {
        System.out.println(name+"叫了一声");
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat() {
        this("喵");
    }
}
