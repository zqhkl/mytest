package com.bjpowernode.javase.io;

import java.io.File;

/*
* File
*   1、File类和四大家族没有关系，所以File类不能完成文件的读和写。
*   2、File对象代表什么？
*       文件和目录路径名的抽象表示形式。
*       D:\javase-进阶 这是一个File对象
*       D:\javase-进阶\temp.txt 也是File对象。
*       一个File对象有可能对应的是目录，也可能是文件。
*       File只是一个路径名的抽象表示形式。
*   3、需要掌握File类中常用的方法
* */
public class FileTest01 {
    public static void main(String[] args)throws Exception {
        //创建一个file对象
        File f1 = new File("D:\\file");

        //判断是否存在！
        System.out.println(f1.exists());

        //如果D：\\file不存在，则以文件的形式创建出来
       /* if (!f1.exists()){
            //以文件形式新建
            f1.createNewFile();
        }*/

        //如果D：\\file不存在，则以目录的形式创建出来
       /* if (!f1.exists()){
            //以目录的形式新建
            f1.mkdir();
        }*/

        //可以创建多重目录吗？
        File f2 = new File("D:/a/b/c/d/e/f");
        /*if (!f2.exists()){
            //多重目录的形式新建。
            f2.mkdirs();
        }*/

        File f3 = new File("D:\\javase-进阶\\temp.txt");
        //获取该文件的父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath); //D:\javase-进阶
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径:" + parentFile.getAbsolutePath());

        File f4 = new File("copy");
        System.out.println("绝对路径：" + f4.getAbsolutePath()); //绝对路径：D:\javase-进阶\project\javase\copy
    }
}
