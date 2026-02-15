package com.itheima.demo3;

public class StringDemo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //传递参数
        System.out.println(arrToString(arr));
    }

    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }
}
