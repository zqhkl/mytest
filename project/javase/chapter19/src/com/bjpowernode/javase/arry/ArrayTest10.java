package com.bjpowernode.javase.arry;
/*
* 关于二维数组中元素的：读和改。
* */
public class ArrayTest10 {
    public static void main(String[] args) {
        //二维数组
        int[][] a={
                {34,4,65},
                {100,200,3900,111},
                {0},
        };
        //请取出以上二维数组中的第1个一维数组。
        for (int i=0;i<a[0].length;i++){
            System.out.println(a[0][i]);
        }
    }
}
