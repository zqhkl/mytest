package com.bjpowernode.javase.string;

/*
*关于Java JDK中内置的一个类：java.lang.String
*    1、String表示字符串类型，属于引用数据类型，不属于基本数据类型。
*    2、在Java中随便使用双引号括起来的都是String对象。例如：“abc”,"def","hello world!"，这3个String对象。
*    3、Java中规定，双引号括起来的字符串，是不可变的。也就是说“abc”从出生到最终死亡，不可变。
*    4、在JDK当中双引号括起来的字符串，例如“abc”,"def"都是直接存储在方法区的字符串常量池当中。
*       为什么SUN公司把字符串存储在一个“字符串常量池”当中呢？因为字符串在实际的开发中使用太频繁。为了提高效率，
*       所以把字符串放到了方法区的字符串常量池当中。
* */
public class StringTest01 {
    public static void main(String[] args) {
        //这两行代码表示底层创建了3个字符串对象，都在字符串常量池当中。
          String s1 = "abcdef";
          String s2 ="abcdef" + "def";

          //这是使用new的方式创建的字符串对象。这个代码中的“xy”是从哪里来的？
          //凡是双引号括起来的都在字符串常量池中有一份。
          //new对象的时候一定在堆内存当中开辟空间。
          String s3 = new String("xy");
    }
}
