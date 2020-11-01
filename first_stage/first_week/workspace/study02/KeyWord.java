package study02;

public class KeyWord {
    public static  final  int age=22;//static 静态  final最终

    public static void main(String[] args) {
        if(age==23){ //条件判断
            System.out.println("I am 23 years old");
        }else {
            System.out.println("I am 23 years old");
        }
        for(int i=30;i>0;i--){ //for循环
            System.out.println("I can't stop!");
            if(i==age) break;
        }
        while (true){//while循环
            break;
        }
        flag : for(;;){
            for(int i=20;i<age;i++){
                if (i==22){
                    break flag;
                }
            }
        }
        int k=age>20?21:age;
    }
}
