import java.util.*;
abstract class Drink
{
    public abstract void taste();
    protected int i1;
    protected int i2;
    protected int i3;
    static void getDrink(int drinkType) throws DrinkNotFoundException
    {
        if (drinkType<1||drinkType>3)
        {
            throw new DrinkNotFoundException();
        }
        switch (drinkType)
        {
            case 1:
                System.out.println("咖啡");
                break;
            case 2:
                System.out.println("啤酒");
                break;
            case 3:
                System.out.println("牛奶");
                break;
        }
    }
}
class Coffee extends Drink
{
    public void taste()
    {
        System.out.println("我是咖啡，味道是苦的");
    }
}
class Beer extends Drink
{
    public void taste()
    {
        System.out.println("我是啤酒，味道是涩的");
    }
}
class Milk extends Drink
{
    public void taste()
    {
        System.out.println("我是牛奶，味道是甜的");
    }
}
public class test1
{
    public static void main(String[] dsa) throws DrinkNotFoundException
    {
        Coffee c=new Coffee();
        c.taste();
        Beer b=new Beer();
        c.taste();
        Milk m=new Milk();
        m.taste();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个饮料编号:");
        try
        {
            int i=input.nextInt();
            m.getDrink(i);
        }
        catch (Exception e)
        {
            throw new DrinkNotFoundException("你输入的编号所对应的饮料不存在");
        }
    }
}
class DrinkNotFoundException extends Exception
{
    DrinkNotFoundException()
    {
        super();
    }
    DrinkNotFoundException(String mrg)
    {
        super(mrg);
    }
}