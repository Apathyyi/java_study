package study01;


public class studyExtends{

    public static void main(String[] args) {
        Student student=new Student();
        student.setName("zhangcw5");
        student.setAge(22);
        System.out.println("姓名："+student.getName()+"  年龄："+student.getAge());
    }
}
class Person {
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
}
class Student extends Person{
}