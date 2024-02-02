package com.bjpowernode.javase.arry;

/*
* 动态初始化二维数组。
* */
public class ArrayTest12 {
    public static void main(String[] args) {
        //三行四列
        //3个一维数组，每个一维数组中4个元素。
        int[][] array = new int[3][4];

        //二维数组遍历
        for (int i =0;i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
