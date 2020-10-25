package com.example.demo;

/**
 * @author sy
 * @date 2020/10/25 16:34
 */
public class Dog extends Animal {

    private String name;
    @Override
    void bark() {
        System.out.println(name+"叫了一声");
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        super();
        this.name = name;
    }

}
