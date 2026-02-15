package com.itheima.demo1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入
        System.out.println("请输入一个三位数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //打印并区分位数
        int ge = a % 10;
        int shi = a / 10 % 10;
        int bai = a / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
