package com.bjpowernode.javase.integer;
/*
* 总结一下之前所学的经典异常？
*     空指针异常：NullPointerException
*     类型转换异常:ClassCastException
*     数组下标越界异常:ArrayIndexOutOfBoundsException
*     数字格式化异常：NumberFormatException
*
* Integer类当中有哪些常用的方法呢？
* */
public class IntegerTest07 {
    public static void main(String[] args) {
        //手动装箱
        Integer x = new Integer(1000);

        //手动拆箱
        int y = x.intValue();
        System.out.println(y);

        Integer a = new Integer("123");
        //编译的时候没问题，一切符合Java语法，运行时会不会出问题呢？
        //不是一个“数字”可以包装成Integer吗？不能。运行时出现异常。
        //Integer a = new Integer("中文");//java.lang.NumberFormatException.forInputString

        //重点方法
        //static int parseInt(String s)
        //静态方法，传参String,返回int
        //int retValue = Integer.parseInt("abc"); //NumberFormatEception
        int retValue = Integer.parseInt("123");
        System.out.println(retValue+100);

        //照葫芦画瓢
        double retValue2 = Double.parseDouble("3.14");
        System.out.println(retValue2+1);
        float retValue3 = Float.parseFloat("1.0");
        System.out.println(retValue3+1);

        //------------------------以下内容作为了解，不需要掌握--------------------------------------
        //static String toBinaryString(int i)
        //静态的：将十进制转换成二进制字符串。
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);

        //static String toBinaryString(int i)
        //静态的：将10进制转换成十六进制字符串。
        String hexString = Integer.toHexString(16);
        System.out.println(hexString);

        //static String toOctalString(int i)
        //静态的：将十进制转换成八进制字符串。
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString);

        //ValueOf方法作为了解
        //static Integer valueOf(int i)
        //静态的 int --> Integer
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        //static Integer valueOf(String s)
        // 静态的 String --> Integer
        Integer i2 =Integer.valueOf("123");
        System.out.println(i2);

        int i=100;
        String s1 = i + "";
        String s2 = String.valueOf(i);
    }
}
