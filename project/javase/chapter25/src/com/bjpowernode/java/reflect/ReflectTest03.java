package com.bjpowernode.java.reflect;

import com.bjpowernode.java.bean.User;

import java.io.FileReader;
import java.util.Properties;

/*
验证反射机制的灵活性。
    java代码写一遍，在不改变Java源代码的基础之上，可以做到不同对象的实例化。
    非常之灵活。(符合OCP开闭原则：对扩展开放，对修改关闭。)

后期你们要学习的是高级框架，而工作过程中，也都是使用高级框架，
包括：ssh、ssm
      Spring SpringMVC Mybatis
      Spring Struts Hibernate
      ...
      这些高级框架底层实现原理：都采用了反射机制。所以反射机制还是重要的。
      学会了反射机制有利于你理解剖析框架底层的源代码。
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception{

        //这种方式代码就写死了。只能创建一个User类型的对象
        User user = new User();

        //以下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改之后，可以创建出不同的实例对象。
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("chapter25/classin2fo.properties");
        //创建属性类对象Map
        Properties pro = new Properties();//key value都是String
        //加载
        pro.load(reader);
        //关闭流
        reader.close();

        //通过key获取value
        String className = pro.getProperty("className");
        //System.out.println(className);

        //通过反射机制实例化对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
