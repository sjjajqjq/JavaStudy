package com.itheima.demo1;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入另一个整数：");
        int b = sc.nextInt();
        int cout = 0;
        for(int i = a;i <= b;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                cout++;
            }
        }
        System.out.println(cout);
    }
}
