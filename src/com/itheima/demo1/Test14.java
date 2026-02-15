package com.itheima.demo1;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        boolean flag = true;
        int i = 2;
        while(i < num){

            if(num % i == 0){
                flag =false;
                break;
            }else if(i == num){
                break;
            }
            i++;
        }
        if(flag){
            System.out.println(num + "是一个质数");
        }else{
            System.out.println(num + "不是一个质数");
        }
    }
}
