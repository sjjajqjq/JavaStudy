package com.itheima.demo3;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个手机品牌");
            String brand = sc.next();
            System.out.println("请输入第" + (i + 1) + "个手机价格");
            int price = sc.nextInt();
            Phone p = new Phone(brand, price);
            p.setBrand(brand);
            p.setPrice(price);
            list.add(p);
        }
        System.out.println(list);
        System.out.println("价格低于3000的手机信息为" + lowerPricePhone(list));
    }
    //将价格低于3000手机信息返回
    public static ArrayList<Phone> lowerPricePhone(ArrayList<Phone> list){
        ArrayList<Phone> lowerPriceList = new ArrayList<>();
        int price = 3000;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() < price){
                lowerPriceList.add(list.get(i));
            }
        }
        return lowerPriceList;
    }
}
