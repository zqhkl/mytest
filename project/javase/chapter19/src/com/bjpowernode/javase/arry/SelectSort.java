package com.bjpowernode.javase.arry;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,223,789,1223,3546,1};
        int min;
        for (int i =0;i<arr.length-1;i++){
            min = i;
            for (int j=i;j<arr.length;j++){
                if (arr[j]<arr[min]){min = j;}
            }
            if (min!=i){
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
