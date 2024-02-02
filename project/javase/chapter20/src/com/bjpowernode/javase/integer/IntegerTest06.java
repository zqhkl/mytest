package com.bjpowernode.javase.integer;

/*
* 这个题目是Integer非常重要的面试题。
* */
public class IntegerTest06 {
    public static void main(String[] args) {

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);  //false

        /*Java中为了提高程序的执行效率，将-128到+127之间的所有的包装对象提前创建好，
        放到了一个方法区的“整数型常量池”当中了，目的是只要用这个区间的数据不需要
        再new了，直接从整数型常量池当中取出来。

        原理：x变量中保存的对象的内存地址和y变量中保存的对象的内存地址是一样的。
        */
        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);//true
    }
}
