package com.itheima.demo3;

public class Test4 {
    public static void main(String[] args) {
        String str = "Hello World yes sdfsdafsd";
        String result = reverse(str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if(result.charAt(i) == ' '){
                sb.reverse().toString();
                System.out.println(sb);
                break;
            }
            sb.append(result.charAt(i));
        }

    }
    //把字符串反转输出
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();
    }
}
