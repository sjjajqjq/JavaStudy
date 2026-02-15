package com.itheima.demo3;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        char[] arr = new char[52];
        //把a-z和A-Z存储进数组当中
        for (int i = 0; i < arr.length; i++) {
            if(i <= 25){
                arr[i] = (char) ('a' + i);
            }else{
                arr[i] = (char) ('A' + i - 26);
            }
        }
        char[] newarr = new char[5];
        //从arr数组中随机抽取5个字符存储到newarr数组中
        Random r = new Random();
        for (int i = 0; i < newarr.length; i++) {
            int index = r.nextInt(arr.length);
            newarr[i] = arr[index];
        }
        //随机生成一个数字0-9并插入到newarr数组中的随机位置
        int num = r.nextInt(10);
        int index = r.nextInt(newarr.length);
        newarr[index] = (char) ('0' + num);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newarr.length; i++) {
            sb.append(newarr[i]);
        }
        System.out.println(sb);
    }
}
