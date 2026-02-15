package com.itheima.demo3;

import java.util.Random;

public class StringDemo6 {
    public static void main(String[] args) {

        String str = "abcdefg";

        // 调用打乱字符串的方法
        String shuffledStr = shuffleString(str);

        // 输出结果
        System.out.println("原字符串：" + str);
        System.out.println("打乱后：" + shuffledStr);
    }

    /**
     * 打乱字符串中的字符
     * @param str 要打乱的字符串
     * @return 打乱后的字符串
     */
    public static String shuffleString(String str) {
        // 将字符串转换为字符数组
        char[] charArray = str.toCharArray();
        Random random = new Random();

        // 使用Fisher-Yates洗牌算法打乱字符
        for (int i = charArray.length - 1; i > 0; i--) {
            // 生成0到i之间的随机索引
            int j = random.nextInt(i + 1);

            // 交换字符
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // 将字符数组转换回字符串
        return new String(charArray);
    }
}