package com.bjpowernode.javase.integer;
/*
* String int Integer之间互相转换
* */
public class IntegerTest08 {
    public static void main(String[] args) {
        //Sting --> int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);//i1是100数字
        System.out.println(i1+1); //101

        //int --> String
        String s2 = i1 + ""; //“100”字符串
        System.out.println(s2+1); //“1001”

        //int --> Integer
        //自动装箱
        Integer x = 1000;

        //Integer --> int
        //自动拆箱
        int y = x;

        //String --> Integer
        Integer k = Integer.valueOf("123");

        //Integer --> String
        String e = String.valueOf(k);
    }
}
