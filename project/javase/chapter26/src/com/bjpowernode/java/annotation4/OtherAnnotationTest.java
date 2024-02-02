package com.bjpowernode.java.annotation4;


import java.lang.annotation.Retention;

public class OtherAnnotationTest {

    //数组是大括号
    @OtherAnnotaion(age = 25,email = {"zhangsan@123.com","zhangsan@sohu.com"},seasonArray = Season.WINTER)
    public void doSome(){

    }

    //如果数组中只有一个元素，大括号可以省略。
    @OtherAnnotaion(age = 25,email = "zhangsan@123.com",seasonArray ={Season.SPRING,Season.SUMMER})
    public void doOther(){

    }
}
