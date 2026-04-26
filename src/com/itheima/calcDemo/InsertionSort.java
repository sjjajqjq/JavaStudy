package com.itheima.calcDemo;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        insertionSort(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }
        // 1 2 3 5 9
    }

    public static void insertionSort(int[] arr) {
        // i 表示当前要插入的元素下标
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];   // 待插入元素
            int j = i - 1;

            // 把比 current 大的元素都向右移动一位
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // 插入到空出来的位置
            arr[j + 1] = current;
        }
    }
}
