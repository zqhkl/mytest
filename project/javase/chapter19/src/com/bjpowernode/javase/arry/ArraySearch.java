package com.bjpowernode.javase.arry;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
* 数组的元素查找
*    数组元素查找有两种方式：
*         第一种方式：一个一个挨着找，直到找到为止。
*         第二种方式：二分查找（算法），这个效率较高。
* */
public class ArraySearch {
    public static void main(String[] args) {
        //这个例子演示一下第一种方式
        int[] arr = {4, 5, 6, 87, 75, 23};

        //需求：找出87的下标，如果没有返回-1
        /*for (int i=0;i<arr.length;i++){
            if (arr[i]==87){
                System.out.println("87元素的下标为： " + i);
                return;
            }
        }
        System.out.println("87不存在！");*/


        //最好以上的程序封装成一个方法，思考：传什么参数？返回什么值
        //传什么？第一个参数：数组。第二个参数：被查找的元素。
        //返回值：被查找的元素的下标。如果找不到返回-1。
        int index = arraySearch(arr,87);
        System.out.println(index == -1?"该元素不存在":"该元素的下标为"+index+"");


    }

    public static int arraySearch(int[] arr,int z){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==z){
                return i;
            }
        }
        return -1;
    }
}
