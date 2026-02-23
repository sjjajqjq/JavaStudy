package com.itheima.polymorphismdemo;

public class Dog extends Aniaml{
        public Dog() {
        }
        public Dog(int age, String color) {
            super(age, color);
        }
        @Override
        public void eat(String sth){
            System.out.println("年龄为"+ getAge() +"岁的"+ getColor() +"的狗两只前腿死死的抱住"+ sth +"猛吃");
        }

        public void lookHome(){
            System.out.println("年龄为"+ getAge() +"岁的"+ getColor() +"的狗正在看家");
        }
}
