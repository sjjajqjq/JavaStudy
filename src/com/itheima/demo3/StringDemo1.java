package com.itheima.demo3;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //键盘录入一串金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额：");
        int money = sc.nextInt();
        //判断金额是否在有效范围内
        while (true) {
            if (money >= 0 && money <= 999999) {
                break;
            } else {
                System.out.println("金额不在有效范围内，请重新输入");
                money = sc.nextInt();
            }

        }

        String result = "";

        //获取金额各位数字
        while(true){
            //获取金额的个位数
            int ge = money % 10;
            //改变获取后的金额
            money = money / 10;
            //将获取的个位数转换城中文并拼接到结果
            result = numToString(ge) + result;
            //设置跳出循环的条件
            if(money == 0){
                break;
            }
        }
        int count = 7 - result.length();
        for (int i = 0; i < count; i++) {
            result = "零" + result;
        }

        //定义数组存储单位
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        //遍历数组插入单位
        for (int i = 0; i < 7; i++) {
            System.out.print(result.charAt(i));
            System.out.print(arr[i]);
        }

    }



    //将数字转换成中文
    public static String numToString(int num){
        //创建壹到玖字符串数组
        String[] arr = {"壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        //返回对应的中文
        return arr[num - 1];
        }
    }


