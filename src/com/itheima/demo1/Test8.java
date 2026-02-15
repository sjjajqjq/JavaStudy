package com.itheima.demo1;

public class Test8 {
    public static void main(String[] args) {
        int count = 0;
        for(double i = 0.1;i <= 8844430;i *= 2){
            count++;
            System.out.println(i);
            System.out.println("第" + count + "次");
        }
    }
}
