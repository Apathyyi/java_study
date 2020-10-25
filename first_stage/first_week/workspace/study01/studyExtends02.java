package study01;

class Person2 {
    private String name;
    private int age;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    //构造方法
    public Person2()
    {
        System.out.println("父类的构造方法");
    }
}
class Student2 extends Person2{
    private String schoolName;
    public String getSchoolName()
    {
        return schoolName;
    }
    public void setSchoolName(String schoolName)
    {
        this.schoolName=schoolName;
    }
    //构造方法
    public Student2()
    {
        System.out.println("子类的构造方法");
    }
}
public class studyExtends02{
    public static void main(String[] args)
    {
        Student2 student=new Student2();
        student.setName("zhangcw5");
        student.setAge(22);
        student.setSchoolName("123School");
        System.out.println("学校："+student.getSchoolName() +" 姓名："+student.getName()+"  年龄："+student.getAge());
    }
}