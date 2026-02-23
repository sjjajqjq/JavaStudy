package com.itheima.polymorphismdemo;

public class Aniaml {
    private int age;
    private String color;

    public Aniaml() {
    }

    public Aniaml(int age, String color) {
        this.age = age;
        this.color = color;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Aniaml{age = " + age + ", color = " + color + "}";
    }

    public void eat(String sth){
        System.out.println("动物正在吃");
    }
}
