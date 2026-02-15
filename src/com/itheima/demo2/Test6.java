package com.itheima.demo2;

public class Test6 {
    public static void main(String[] args) {
        int[][] yearArrArr = {{11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}};

        int yearSum = 0;
        //遍历二维数组
        for (int i = 0; i < yearArrArr.length; i++) {
            int[] quarterSum = yearArrArr[i];
                int sum = getSum(quarterSum);
                System.out.println("第" + (i + 1) + "季度的总和为：" + sum);
                yearSum += sum;

        }
        System.out.println("全年的总和为：" + yearSum);



    }


    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
