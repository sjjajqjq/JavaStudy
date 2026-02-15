package com.itheima.demo3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //记录字符的个数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch > 'a' && ch < 'z'){
                smallCount++;
            }
            else if(ch > 'A' && ch < 'Z'){
                bigCount++;
            }
            else if(ch > '0' && ch < '9'){
                numberCount++;
            }

        }
        System.out.println("大写字母个数：" + bigCount);
        System.out.println("小写字母个数：" + smallCount);
        System.out.println("数字个数：" + numberCount);

    }
}
