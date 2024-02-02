package com.bjpowernode.javase.arry;
/*
* 关于Java中的二维数组
*   1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组。
*   2、三维数组是什么？
*        三维数组是一个特殊的二维数组，特殊在这个二维数组中每一个元素是一个一维数组。
*        实际的开发中使用的最多的就是一维数组。二维数组也很少使用。三维数组几乎不用。
*   3、二维数组静态初始化
*       int[][] array={{1,2,3},{4,1,6},{2,1,5,9,7}};
* */
public class ArrayTest09 {
    public static void main(String[] args) {
        //一维数组
        int[] array = {100,200,300};
        System.out.println(array.length); //3

        //二维数组
        //以下代码当中里面的是4个一维数组。
        int[][] a = {
                {100,200,300},
                {30,20,40,50,60},
                {6,7,9,1},
                {0}
        };
        System.out.println(a.length); //4
        System.out.println(a[0].length);//3
        System.out.println(a[1].length);//5
        System.out.println(a[2].length);//4
        System.out.println(a[3].length);//1

        int[][] a2 = {
                {100,20,30},
                {50,60,700},
                {2000,100,50},
                {98,54,21},
                {125}
        };
    }
}
