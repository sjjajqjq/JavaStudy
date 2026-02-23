package com.itheima.polymorphismdemo;

public class Cat extends Aniaml{
        public Cat() {

        }
        public Cat(int age, String color) {
            super(age, color);
        }
        @Override
        public void eat(String sth){
            System.out.println("年龄为"+ getAge() +"岁的"+ getColor() +"的猫眯着眼睛侧着头吃"+ sth);
        }

        public void catchMouse(){
            System.out.println("年龄为"+ getAge() +"岁的"+ getColor() +"的猫抓老鼠");
        }
}
