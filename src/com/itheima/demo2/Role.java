package com.itheima.demo2;

import java.util.Random;

public class Role {
    private String name;
     private int blood;


    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //让一个角色攻击另一个角色
    public void attack(Role role){
        //计算伤害值
        Random r = new Random();
        int damage = r.nextInt(20) + 1;
        int remainBlood = (role.getBlood() - damage);
        //判断血量是否小于等于0
        remainBlood = remainBlood <= 0 ? 0 : remainBlood;
        //设置角色的血量
        role.setBlood(remainBlood);


        System.out.println(this.getName() + "攻击了" + role.getName() + "造成了" + damage + "点伤害" + role.getName() + "还剩下" + remainBlood + "点血量");

    }
}
