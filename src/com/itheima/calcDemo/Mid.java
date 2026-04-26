package com.itheima.calcDemo;

public class Mid {
    static void main() {
        //生成一个带有六个随机数的数组,范围为1-100
        int[] arr = {23, 44, 55, 78, 99};

        int num = 100;

        System.out.println(halfSeach(arr, num));
    }

    private static int halfSeach(int[] arr, int num) {
        //二分查找算法
        int min = 0;
        int max = arr.length - 1;
        int mid = min + (max - min) / 2;

        while (true) {
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else if (arr[mid] == num) {
                return arr[mid];
            }
            return -1;
        }
    }

}
