package com.itheima.demo3;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //创建两个字符串A和B
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串B");
        String B = sc.next();
        System.out.println("输入的字符串B为：" + B);
        System.out.println("请输入字符串A");
        String A = sc.next();
        System.out.println("输入的字符串A为：" + A);
        Boolean flag = rotateA(A, B);
        if(flag){
            System.out.println("A旋转后匹配B");
        }else{
            System.out.println("A旋转后不匹配B");
        }
    }

    //创建判断是否匹配的构造方法
    public static Boolean rotateA(String A, String B){

        //旋转A
        for (int i = 0; i < A.length(); i++) {
             A = A.substring(1) + A.substring(0, 1);
             if(A.equals(B)){
                 return true;
             }
        }
        return false;
    }
}
