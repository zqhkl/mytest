package com.bjpowernode.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 深入try..catch
*   1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型。
*   2、catch可以写多个。建议catch的时候，精确的一个一个处理，这样容易程序的调试。
*   3、catch写多个的时候，从上到下，必须遵守从小到大。
* */
public class ExceptionTest07 {
   /* public static void main(String[] args) throws FileNotFoundException,Exception,NullPointerException {

    }*/

   /* public static void main(String[] args) throws Exception {

    }*/

    public static void main(String[] args) {
        //编译报错
    /*    try{
        new FileInputStream("D:\\javase-进阶\\document\\day20课堂笔记.txt");
    }catch (NullPointerException){

        }*/

      /*  try{
            new FileInputStream("D:\\avase-进阶\\document\\day20课堂笔记.txt");
            System.out.println("以上如果出现异常，这里无法执行！");
        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }

        System.out.println("hello world!");*/

        try{
            new FileInputStream("D:\\avase-进阶\\document\\day20课堂笔记.txt");
            System.out.println("以上如果出现异常，这里无法执行！");
        }catch (IOException e){ //多态： IOException e = new FileNotFoundException();
            System.out.println("文件不存在");
        }

/*
        try{
            new FileInputStream("D:\\avase-进阶\\document\\day20课堂笔记.txt");
            System.out.println("以上如果出现异常，这里无法执行！");
            }catch (Exception e){ //多态： Exception e = new FileNotFoundException();
            System.out.println("文件不存在");
        }*/

       /* try{
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\avase-进阶\\document\\day20课堂笔记.txt");
            //读文件
            fis.read();
        }catch (FileNotFoundException e){ //多态： Exception e = new FileNotFoundException();
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("读文件报错了！");
        }*/

        //编译报错
      /*  try{
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\avase-进阶\\document\\day20课堂笔记.txt");
            //读文件
            fis.read();
        }catch (IOException e){ //多态： Exception e = new FileNotFoundException();
            System.out.println("文件不存在");
        }catch (FileNotFoundException e){
            System.out.println("读文件报错了！");
        }*/

        //JDK8的新特性！
        try{
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\avase-进阶\\document\\day20课堂笔记.txt");
            //进行数学运算
            System.out.println(100/0); //这个异常是运行时异常，编写程序时，可以处理，也可以不处理。
        }catch (FileNotFoundException  | ArithmeticException e){
            System.out.println("文件不存在？数学异常？都有可能！");
        }

    }
}
