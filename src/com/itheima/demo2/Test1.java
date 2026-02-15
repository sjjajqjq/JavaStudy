package com.itheima.demo2;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copyArr = copyOfRange(arr, 2, 7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }

    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        //新数组的长度
        int[] newArr = new int[to - from];
        //将arr数组中对应索引的元素复制到新数组中
        //创建伪造索引
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

}
