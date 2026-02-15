package com.itheima.demo2;

import java.util.Random;


public class Test4 {
    public static void main(String[] args) {
        Random r = new Random();
        int score = r.nextInt(101);
        int[] scores = new int[6];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = r.nextInt(101);
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.print("评委的成绩为：" + scores[i]);
        }

        int max = getMax(scores);
        int min = getMin(scores);
        int sum = getSum(scores);

        System.out.println("\n" + "平均分为：" + (sum - max - min)/(scores.length - 2));
    }

    public static int getSum(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

        public static int getMax (int[] scores){
            int max = scores[0];
            for (int i = 0; i < 6; i++) {
                if (scores[i] > max) {
                    max = scores[i];
                }
            }
            return max;
        }

        public static int getMin(int[] scores){
            int min = scores[0];
            for (int i = 0; i < 6; i++) {
                if (scores[i] < min) {
                    min = scores[i];
                }
            }
            return min;
        }
}
