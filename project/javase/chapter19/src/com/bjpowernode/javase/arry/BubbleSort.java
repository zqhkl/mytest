package com.bjpowernode.javase.arry;

/*
* 冒泡排序算法
* */
public class BubbleSort {
    public static void main(String[] args) {
        //这是int类型的数组对象
        int[] arr={3,2,7,6,8};

        //经过冒泡排序算法对以上数组中元素进行排序
        //冒牌排序算法的核心是什么？
        for (int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
    }

