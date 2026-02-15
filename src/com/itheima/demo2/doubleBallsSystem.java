package com.itheima.demo2;

import java.util.Random;
import java.util.Scanner;

public class doubleBallsSystem {
    public static void main(String[] args) {
        //用户输入购买号码
        int[] inputNums = userNums();
        System.out.println("用户输入号码为：");
        for (int i = 0; i < inputNums.length; i++) {
            System.out.print(inputNums[i] + " ");
        }
        //生成中奖号码
        int[] lastNums = winingNums();
        System.out.print("\n" + "中奖红球号码为：");
        for (int i = 0; i < lastNums.length - 1; i++) {
            System.out.print(lastNums[i] + " ");
        }
        System.out.println("\n" + "中奖蓝球号码为：" + lastNums[lastNums.length - 1]);
        //判断用户是否中奖
        int redCount = 0;
        int blueCount = 0;
        //判断红球号码是否中奖
        for (int i = 0; i < inputNums.length - 1; i++) {
            for (int j = 0; j < lastNums.length - 1; j++) {
                if (inputNums[i] == lastNums[j]) {
                    redCount++;
                    break;
                }
            }
        }
        //判断蓝球号码是否中奖
        if (inputNums[inputNums.length - 1] == lastNums[lastNums.length - 1]) {
            blueCount++;
        }

        System.out.println("红球中奖的个数为" + redCount);
        System.out.println("蓝球中奖的个数为" + blueCount);

        //判断用户中几等奖
        if (redCount == 6 && blueCount == 1) {
            System.out.println("您中了一等奖，奖励1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("您中了二等奖，奖励500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("您中了三等奖，奖励3000元");
        } else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1) {
            System.out.println("您中了四等奖，奖励200元");
        } else if (redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1) {
            System.out.println("您中了五等奖，奖励10元");
        } else if (redCount == 2 && blueCount == 1 || redCount == 1 && blueCount == 1 || redCount == 0 && blueCount == 1) {
            System.out.println("您中了六等奖，奖励5元");
        } else {
            System.out.println("您未中奖");
        }
    }



    //生成中奖红球和蓝球的号码
    public static int[] winingNums() {
        int[] arr = new int[7];
        Random r = new Random();
        //生成红球号码
        for (int i = 0; i < arr.length - 1; ) {
            int rednum = r.nextInt(1, 34);
            boolean flag = contains(arr, rednum);
            if (!flag) {
                arr[i] = rednum;
                i++;
            }
        }
        //生成蓝球号码
        int bluenum = r.nextInt(1, 17);
        arr[arr.length - 1] = bluenum;
        return arr;
    }

    //判断是否重复
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    //用户输入红球和蓝球的号码
    public static int[] userNums() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        //输入红球号码
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入您第" + (i + 1) + "红球号码：");
            int rednum = sc.nextInt();
            boolean flag = contains(arr, rednum);
            if (!flag) {
                arr[i] = rednum;
                i++;
            } else {
                System.out.println("您输入的红球号码重复，请重新输入！");
            }
        }
        //输入蓝球号码
        System.out.println("请输入您的蓝球号码：");
        int bluenum = sc.nextInt();
        arr[arr.length - 1] = bluenum;

        return arr;

    }
}
