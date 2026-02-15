package com.itheima.demo1;

import java.util.Random;

public class Test18 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int num = 0;
        int average = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(1, 100);
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        System.out.println(num);
        average = num / arr.length;
        System.out.println(average);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        System.out.println(count);

    }
}
