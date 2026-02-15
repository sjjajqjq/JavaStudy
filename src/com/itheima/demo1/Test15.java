package com.itheima.demo1;

import java.util.Random;

public class Test15 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(4)+7;
            System.out.println(num);
        }

    }
}
