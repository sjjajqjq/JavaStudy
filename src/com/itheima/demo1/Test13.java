package com.itheima.demo1;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数");
        int num = sc.nextInt();
        int i = 1;
        while (i < num){
            if(i * i == num){
                System.out.println(i + "是" + num + "的平方根");
                break;
            } else if (i * i > num) {
                System.out.println(i - 1 + "是" + num + "的平方根的近似值");
                break;
            }
            i++;

        }


    }
}
