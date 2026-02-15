package com.itheima.demo3;

public class Test3 {
    public static void main(String[] args) {
        String num1 = "4";
        String num2 = "2";
        int n1 = parseInt(num1);
        int n2 = parseInt(num2);
        int n = n1 * n2;
        String result = convertToString(n);
        System.out.println(result);

    }

    //定义一个构造方法把字符转换城int类型
    public static int parseInt(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            num = num * 10 + (c - '0');
        }
        return num;
    }

    //定义一个构造方法把int类型转换城字符串类型
    public static String convertToString(int num) {
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            int n = num % 10;
            sb.append(n);
            num = num / 10;
        }
        return sb.reverse().toString();
    }
}