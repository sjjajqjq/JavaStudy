package com.itheima.demo1;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        // 从键盘获取一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        //把整数存储在变量x
        int x = sc.nextInt();
        //定义一个临时变量存储x用作最后比较
        int temp = x;
        //定义num来存储x的倒数
        int num = 0;
        //使用循环计算x的倒数
        while(x != 0){
            num = num * 10 + x % 10;
            x /= 10;
        }
        //判断x的倒数是否与原数相等
        System.out.println(temp == num ? "是回文数" : "不是回文数");
    }
}
