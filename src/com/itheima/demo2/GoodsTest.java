package com.itheima.demo2;

public class GoodsTest {
    public static void main(String[] args) {
        //创建一个数组储存商品对象
        Goods[] arr = new Goods[3];
        //创建商品对象
        Goods g1 = new Goods("001", "苹果17", 9999, 100);
        Goods g2 = new Goods("002", "小米14", 8999, 200);
        Goods g3 = new Goods("003", "oppo15", 6999, 300);
        //将商品对象添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
             System.out.println("商品id为：" + goods.getId() + "，商品名称为：" + goods.getName() + "，商品价格为：" + goods.getPrice() + "，商品库存为：" + goods.getStock());
        }
    }
}
