package com.itheima.demo3;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        System.out.println(str);
        //创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
        //判断是否为回文字符串
        if (str.equals(sb.toString())) {
            System.out.println("是回文字符串");
        } else {
            System.out.println("不是回文字符串");
        }
    }
}