package com.itheima.demo1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入第一只老虎的体重");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int b = sc.nextInt();
        System.out.println(a == b?"两只老虎体重相等":"两只老虎体重不相等");
    }
}
