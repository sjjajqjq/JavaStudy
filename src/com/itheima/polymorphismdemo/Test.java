package com.itheima.polymorphismdemo;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王", 30);
        Dog d = new Dog(2, "黑");
        p.keepPet(d);
        Cat c = new Cat(1, "白");
        p.keepPet(c);
        System.out.println("第二个程序员");
        System.out.println("第一个程序员");
    }
}
