package study02;

class Animal{
    public int month = 2;
    public void eat(){
        System.out.println("动物吃东西");
    }

}

class Dog extends Animal{
    public int month = 3;

    public void eat() {
        System.out.println("小狗吃肉");
    }

    public void sleep() {
        System.out.println("小狗睡午觉");
    }
}

class Cat extends Animal{
    public int month = 4;

    public void eat() {
        System.out.println("小猫吃鱼");
    }
}

public class studyDuoTai {
    public static void main(String[] args){
        Animal a = new Dog();
        Animal b = new Cat();
        a.eat();
        System.out.println(a.month);
        b.eat();
        System.out.println(b.month);

    }
}