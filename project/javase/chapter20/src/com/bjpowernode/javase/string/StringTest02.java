package com.bjpowernode.javase.string;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);  //true

        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x==y);//false

        //通过这个案例的学习，我们知道了，字符串对象之间的比较不能使用“==”
        //"=="不保险，应该调用String类的equals()方法。
        //String类已经重写了equals方法，以下的equals方法调用的是String重写之后的equals方法。
        System.out.println(x.equals(y)); //true

        String k = new String("testString");
        System.out.println("testString".equals(k));//true
    }
}
