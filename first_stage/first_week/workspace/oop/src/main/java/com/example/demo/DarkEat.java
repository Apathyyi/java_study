package com.example.demo;

/**
 * @author sy
 * @date 2020/10/25 16:43
 */
public class DarkEat implements IEat,Fly{
    private String food;

    public DarkEat() {
    }

    public DarkEat(String food) {
        this.food = food;
    }

    @Override
    public void eat() {
        System.out.println("Dark eat");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dark eat "+food);
    }

    @Override
    public void fly() {
        System.out.println("Dark fly");
    }
}
