package com.example.demo;

/**
 * @author sy
 * @date 2020/10/25 16:44
 */
public class FishEat implements IEat {
    private String food;

    public FishEat() {

    }

    public FishEat(String food) {
        this.food = food;
    }

    @Override
    public void eat() {
        System.out.println("Fish eat"+food);
    }

    @Override
    public void eat(String food) {
        System.out.println("Fish eat "+food);
    }
}
