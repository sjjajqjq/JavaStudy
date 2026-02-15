package com.itheima.demo3;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个只包含数字1-9的字符串");
        StringJoiner sj = new StringJoiner(",", "[", "]");

        //调用确认输入是否合法的构造方法
        while (true) {
            String str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    int num = c - '0';
                    sj.add(strToRoman(num));
                }
                System.out.println(sj);
                break;
            } else {
                System.out.println("您输入的字符串不合法，请重新输入");
                continue;
            }
        }
    }
    //创建返回罗马数字的构造方法
    public static String strToRoman(int num){
        //定义罗马数字1-9的数组
        String[] roman = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return roman[num];
    }

    //创建确认输入是否合法的构造方法
    public static boolean checkStr(String str) {
        //遍历字符串，确认是否为1-9
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '1' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
