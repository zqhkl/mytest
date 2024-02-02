package com.bjpowernode.javase.arry;

import java.util.Arrays;

/*
* 使用一下SUN公司提供的数组工具类：java.util.Arrays;
* */
public class ArraysTest01 {
    public static void main(String[] args) {
        //工具类当中的方法大部分都是静态的。
        int[] arr = {2,3,4,5,6,9,8,75,123,1,2,3,5};
        Arrays.sort(arr);
        //遍历输出
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
