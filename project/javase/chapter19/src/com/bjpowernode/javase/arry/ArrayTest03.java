package com.bjpowernode.javase.arry;

public class ArrayTest03 {
    public static void main(String[] args) {
        //调用方法时传递一个数组
        int[] x = {1,2,3,4};
        printArray(x);
        String[] strs = {"abc","def"};
        printArray(strs);
        String[] stringArray= new String[10];
        printArray(stringArray);
    }

    public static void printArray(int[] array){
        for (int i =0;i<array.length;i++)
            System.out.println(array[i]);
    }

    public static void printArray(String[] args){
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
