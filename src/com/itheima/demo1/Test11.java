package com.itheima.demo1;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        // 从键盘获取一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个被除数：");
        int a = sc.nextInt();
        System.out.println("请输入一个除数：");
        int b = sc.nextInt();
        int cout = 0;
        while(a >= b){
            a -= b;
            cout++;
        }
        System.out.println("商为：" + cout);
        System.out.println("余数为：" + a);
    }
}
