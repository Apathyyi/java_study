package com.example.demo.bean;

/**
 * @author sy
 * @date 2020/11/1 15:06
 */
public class People {
    public String name;
    private int age;
    protected  String gender;
    public People() {
    }

    public People(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sayHello(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void say(){
        System.out.println("static hello");
    }
}
