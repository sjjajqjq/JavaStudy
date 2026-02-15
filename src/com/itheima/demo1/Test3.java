package com.itheima.demo1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入另一个整数：");
        int b = sc.nextInt();
        boolean result = ((a == 6 || b == 6) || (a + b) % 6 == 0);
        System.out.println(result);
    }
}
