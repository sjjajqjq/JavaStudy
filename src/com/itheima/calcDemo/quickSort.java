package com.itheima.calcDemo;


import java.util.Random;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        double start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        double end = System.currentTimeMillis();

        System.out.println("排序耗时: " + (end - start) + "ms");
    }

    private static void quickSort(int[] arr, int i, int j) {
        if(i >= j) {
            return;
        }
        int baseIndex = firstQuickSort(arr, i ,j);
        quickSort(arr, i, baseIndex - 1);
        quickSort(arr, baseIndex + 1, j);
    }

    private static int firstQuickSort(int[] arr, int i, int j) {
        int baseValue = arr[i]; // 基准数的值
        int start = i;          // 应当从本次要找的范围 i 开始
        int end = j;            // 应当从本次要找的范围 j 结束

        while(start < end) {
            // 先找右边比基准数小的（必须先移动右边）
            while(start < end && arr[end] >= baseValue) {
                end--;
            }
            // 再找左边比基准数大的
            while(start < end && arr[start] <= baseValue) {
                start++;
            }
            // 如果没相遇，交换这两个值
            if(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        // 当 start 和 end 相遇时，将起始基准数放到他们相遇的正确位置上
        arr[i] = arr[start];
        arr[start] = baseValue;
        
        // 这时返回的才是基准数的 正确新下标（索引）
        return start;
    }
}
