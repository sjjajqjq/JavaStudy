package com.itheima.demo2;

public class GameTest {
    public static void main(String[] args) {
        //创建两个角色
        Role role1 = new Role("张三", 100);
        Role role2 = new Role("李四", 100);
        //创建一个循环使两个角色不断攻击到一方血量归零
        while(true){
            role1.attack(role2);
            if(role2.getBlood() == 0){
                System.out.println(role1.getName() + "赢了");
                break;
            }
            role2.attack(role1);
            if(role1.getBlood() == 0){
                System.out.println(role2.getName() + "赢了");
                break;
            }
        }
    }
}
