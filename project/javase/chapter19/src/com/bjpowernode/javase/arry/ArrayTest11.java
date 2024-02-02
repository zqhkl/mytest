package com.bjpowernode.javase.arry;

/*
* 二维数组的遍历
* */
public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] array = {
                {"java","oracle","c++","python","C#"},
                {"张三","李四","王五"},
                {"lucy","jack","rose"}
        };

        //遍历二维数组
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
