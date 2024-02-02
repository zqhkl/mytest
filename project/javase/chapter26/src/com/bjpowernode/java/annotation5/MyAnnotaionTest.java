package com.bjpowernode.java.annotation5;

@MyAnnotation("上海浦东区") //可以
public class MyAnnotaionTest {

    //@MyAnnotation 不行
    int i;

    //@MyAnnotation  不行
    public MyAnnotaionTest(){

    }

    @MyAnnotation //可以
    public void doSome(){

        //@MyAnnotation 不行
        int i;
    }
}
