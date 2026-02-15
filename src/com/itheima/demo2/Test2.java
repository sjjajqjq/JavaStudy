package com.itheima.demo2;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        char[] yzm = new char[52];
        String result = "";
        //将所有的大写字母和小写字母都存储到yzm数组中
        for (int i = 0; i < yzm.length; i++) {
            if (i < 26) {
                yzm[i] = (char) ('A' + i);
            } else {
                yzm[i] = (char) ('a' + i - 26);
            }
        }

        Random r = new Random();

        //随机抽取4个字符
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(yzm.length);
            result += yzm[randomIndex];
        }

        int num = r.nextInt(10);

        result += num;

        System.out.println(result);
    }
}
