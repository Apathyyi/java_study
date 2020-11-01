package study01;

import java.util.Scanner;

public class SF1026 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num==1){
            System.out.println("1");
            return;
        }
        int[] n=new int[num];
        for(int i=0;i< num;i++){
            n[i]=scanner.nextInt();
        }
        int left=0;
        int right=2;
        int f=left;
        int size=2;
        while(right<num){
            if(n[f]+n[f+1]==n[right]){
                f++;
                right++;
                size=size>right-left?size:right-left;
            }else {
                size=size>right-left?size:right-left;
                f++;
                left=f;
                right++;
            }
        }
        System.out.println(size);
    }
}
