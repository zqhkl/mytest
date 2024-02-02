package com.bjpowernode.java.annotation;

//表示这个类已过时。
@Deprecated
public class AnnotationTest03 {
    public static void main(String[] args) {
        AnnotationTest03 at = new AnnotationTest03();
        at.doSome();
    }

    //@Deprecated这个注解标注的元素已过时。
    //这个注解主要是向其它程序员传达一个信息，告知已过时，有更好的解决方案存在。
    @Deprecated
    public  void doSome(){
        System.out.println("do something!");
    }

    @Deprecated
    public static void doOther(){
        System.out.println("do Other....");
    }
}

class T{
    public static void main(String[] args) {
        AnnotationTest03 at = new AnnotationTest03();
        at.doSome();

        AnnotationTest03.doOther();

    }
}
