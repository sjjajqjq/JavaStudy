package com.itheima.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("-----------------------学生管理系统---------------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入您的选择");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> addStudent(list);
                case 2 -> deleteStudent();
                case 3 -> updateStudent();
                case 4 -> queryStudent(list);
                case 5 -> {
                    System.out.println("退出系统");
                    break loop;
                }
                default -> System.out.println("您的选择有误，请重新输入");
            }
        }
    }
    //添加学生方法
    public static ArrayList<Student> addStudent(ArrayList<Student> list){
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        stu.setId(id);
        System.out.println("请输入学生姓名");
        String name = sc.next();
        stu.setName(name);
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.println("请输入学生地址");
        String address = sc.next();
        stu.setAddress(address);
        System.out.println("添加学生成功");
        //将学生对象添加到集合中
        list.add(stu);
        return list;
    }
    //删除学生方法
    public static void deleteStudent(){
        System.out.println("删除学生");
    }
    //修改学生方法
    public static void updateStudent(){
        System.out.println("修改学生");
    }
    //查询学生方法
    public static void queryStudent(ArrayList<Student> list){
        if (list.size() == 0){
            System.out.println("当前无学生信息，请添加学生后再来查询");
            return;
                }
        System.out.println("学号\t姓名\t年龄\t地址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }
}
