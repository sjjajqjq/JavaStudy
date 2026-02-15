package com.itheima.demo2;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 3};
        arr = plus(arr);
        arr = chu(arr);
        arr = back(arr);
        System.out.println("反转后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("拼接后的数字为：");
        System.out.println(getSum(arr));
    }

    public static int[] plus(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        System.out.println("加5后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public static int[] chu(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }
        System.out.println("取余后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public static int[] back(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum * 10 + arr[i];
        }
        return sum;
    }
}