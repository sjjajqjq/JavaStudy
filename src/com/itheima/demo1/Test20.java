package com.itheima.demo1;

public class Test20 {
    public static void main(String[] args) {
        printArray(new int[]{11, 22, 33, 44, 55});
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
