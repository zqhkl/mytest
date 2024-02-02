package com.bjpowernode.javase.random;

import java.util.Arrays;
import java.util.Random;

/*
* 编写程序，生成5个不重复的随机数[0-100]。重复的话重新生成。
* 最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。
* */
public class RandomTest02 {
    public static void main(String[] args) {
        //创建Random对象
        Random random = new Random();
        //准备一个长度为5的一维数组。
        int[] arr = new int[5]; //默认值都是0
        for (int i =0 ; i<arr.length;i++){
            arr[i]=-1;
        }

        //循环，生成随机数
        int index = 0;
        while(index < arr.length){
            //生成随机数
            int num = random.nextInt(100);
            //判断arr数组中有没有这个num
            //如果没有这个num，就放进去。
            if (!(contains(arr, num))){
                arr[index++] = num;
            }
        }
        //遍历以上数组
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
    public static boolean contains(int[] arr,int key) {
        //这个方案有bug。（排序出问题了。）
      /*  对数组进行升序
       Arrays.sort(arr);
       进行二分法查找
        int index = Arrays.binarySearch(arr, key);
        if (index>=0)
            return true;
        else
            return false;*/

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
