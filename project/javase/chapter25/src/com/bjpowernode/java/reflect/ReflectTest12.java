package com.bjpowernode.java.reflect;

import com.bjpowernode.java.bean.Vip;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.lang.reflect.Constructor;

/*
比上一个例子（ReflectTest11）重要一些！！！

通过反射机制调用构造方法实例化Java对象。（这个不是重点）
 */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        //不使用反射机制怎么创建对象
        Vip v1 = new Vip();
        Vip v2 = new Vip(110,"zhangsan","2001-10-11",true);

        //使用反射机制怎么创建对象呢？
        Class c = Class.forName("com.bjpowernode.java.bean.Vip");
        //调用无参数构造方法
        Object obj = c.newInstance();
        System.out.println(obj);

        //调用有参数的构造方法怎么办？
        //第一步：先获取到这个有参数的构造方法
       Constructor con =  c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
       //第二步：调用构造方法new对象
        Object newObj = con.newInstance(110,"jackson","1990-10-11",true);
        System.out.println(newObj);

        //获取无参数构造方法
        Constructor con2 = c.getDeclaredConstructor();
        Object newObj2 = con2.newInstance();
        System.out.println(newObj2);
    }
}
