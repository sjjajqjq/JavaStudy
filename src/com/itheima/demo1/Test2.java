package com.itheima.demo1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入你的时髦程度（1-10）：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入你对象的时髦程度（1-10）：");
        int b = sc.nextInt();
        boolean result = a > b;
        System.out.println(result);
        }
    }
