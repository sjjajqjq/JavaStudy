package com.itheima.demo1;

public class Test16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(num += arr[i]);
        }
    }
}
