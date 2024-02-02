package com.bjpowernode.javase.integer;
/*
* 好消息：在Java5之后，引入了一种新特性，自动装箱和自动拆箱
*    自动装箱：基本数据类型转换成包装类。
*    自动拆箱：包装类自动转换为基本数据类型。
*
* 有了自动拆箱之后，Number类种的方法就用不着了！
*
* 自动装箱和自动拆箱的好处？
*     方便编程。
* */
public class IntegerTest05 {
    public static void main(String[] args) {
        //900是基本数据类型
        //x是包装类型
        //基本数据类型自动转换为包装类型：自动装箱
        Integer x = 900;
        System.out.println(x);

        //x是包装类型
        //y是基本数据类型
        //包装类型自动转换为基本数据类型：自动拆箱
        int y = x;
        System.out.println(y);

        Integer z = 1000;
        //分析为什么这个没有报错呢？
        //+两边要求是基本数据类型的数组，z是包装类，不属于基本数据类型，这里会进行自动拆箱。将z自动转换为基本数据类型。
        System.out.println(z+1);

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b);//false
    }
}
