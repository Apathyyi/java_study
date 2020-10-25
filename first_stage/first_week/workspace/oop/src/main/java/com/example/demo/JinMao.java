package com.example.demo;

/**
 * @author sy
 * @date 2020/10/25 17:14
 */
public class JinMao extends Dog {
    private String age ;
    @Override
    void bark() {
        super.bark();
        System.out.println("JIN MAO bark");
    }

    public JinMao(String name, String age) {
        super(name);
        this.age = age;
    }

}
