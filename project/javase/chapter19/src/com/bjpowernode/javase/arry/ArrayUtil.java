package com.bjpowernode.javase.arry;
/*
* 二分查找
* */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr={123,0,2,1564,123,0,1213,18};  //找2
        int low=0,high=arr.length-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if (arr[mid] == 2){
                System.out.println("找到了，2的下标为：" + mid);
                return;
            }
            else if (arr[mid]>18){
                high= mid-1;
            }
            else{
                low = mid +1;
            }
        }
        System.out.println("数组中不存在18");

    }
}
