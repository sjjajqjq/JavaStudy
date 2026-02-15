package com.itheima.demo3;

public class StudentTest {
    public static void main(String[] args) {
        //创建一个数组储存学生对象
        Student[] arr = new Student[3];
        //创建学生对象
        Student stu1 = new Student(1001, "张三", 18);
        Student stu2 = new Student(1002, "李四", 19);
        Student stu3 = new Student(1003, "王五", 20);
        //将学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //再次添加一个学生对象
        Student stu4 = new Student(1004, "赵六", 21);
        //唯一性判断
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //当学号已存在时
            //提示用户学号已存在
            System.out.println("学号已存在");
        } else {
            //当学号不存在时
            //数组已满时
            if (count(arr) == arr.length) {
                //创建一个新的数组并复制原数组中的元素
                Student[] newArr = createArr(arr);
                //新对象添加到新数组中
                newArr[newArr.length - 1] = stu4;
                //遍历(新/旧)数组
                printArr(newArr);
            }
            else{
                //数组未满时
                //将新的学生对象添加到数组中
                arr[arr.length - 1] = stu4;
                //遍历(新/旧)数组
                printArr(arr);
            }




        }




    }
    //唯一性判断
    public static boolean contains (Student[]arr,int id){
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //判断数组中的每个元素是否和数组中包含的学生学号相等
            if (arr[i].getId() == id) {
                //如果相等，返回true
                return true;
            }
        }
        return false;
    }
    public static int count (Student[]arr){
        //遍历数组
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            //判断数组中的每个元素是否为null
            if (arr[i] != null) {
                //如果不为null，count加1
                count++;
            }
        }
        return count;
    }

    public static Student[] createArr(Student[]arr){
        //创建一个新的数组
        Student newArr[] = new Student[arr.length + 1];
        //复制原数组中的元素到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;

    }

    public static Student[] printArr(Student[]arr){
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //判断数组中的每个元素是否为null
            if (arr[i] != null) {
                //如果不为null，打印学生信息
                System.out.println("学号为：" + arr[i].getId() + "，姓名为：" + arr[i].getName() + "，年龄为：" + arr[i].getAge());
            }
        }
        return arr;
    }
}