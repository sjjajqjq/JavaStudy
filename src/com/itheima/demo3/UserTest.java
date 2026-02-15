package com.itheima.demo3;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            User u = new User();
            System.out.println("请输入第" + (i + 1) + "个用户的id");
            int id = sc.nextInt();
            System.out.println("请输入第" + (i + 1) + "个用户的用户名");
            String userName = sc.next();
            System.out.println("请输入第" + (i + 1) + "个用户的密码");
            String password = sc.next();
            u.setId(id);
            u.setUserName(userName);
            u.setPassword(password);

            list.add(u);

            System.out.println(list);
        }
        System.out.println("请输入要查询的用户id");
        int checkId = sc.nextInt();
        Boolean flag = checkLogin(list,checkId);
        if(flag){
            System.out.println("该用户存在");
        }else{
            System.out.println("该用户不存在");
        }
    }
    public static Boolean checkLogin(ArrayList<User> list,int id){
        for (int i = 0; i < list.size(); i++) {
            User check = list.get(i);
            if(check.getId() == id){
                return true;
            }
        }
        return false;
    }
}
