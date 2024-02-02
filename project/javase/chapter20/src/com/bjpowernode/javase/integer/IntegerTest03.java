package com.bjpowernode.javase.integer;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

/*
* 关于Integer类的构造方法，有两个：
*         Integer(int)
*         Integer(String)
* */
public class IntegerTest03 {
    public static void main(String[] args) {
        //将int类型的数字，转换成Integer包装类型。(int---->Integer)
        Integer x = new Integer(100);
        System.out.println(x);

        //将String类型的数字，转换成Integer包装类型。(String---->Integer)
        Integer y = new Integer("123");
        System.out.println(y);

        double d = new Double(1.23);
        System.out.println(d);

        double e = new Double("3.14");
        System.out.println(e);


    }
}
