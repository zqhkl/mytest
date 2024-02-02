package com.bjpowernode.javase.date;
/*
* 获取自1970年1月1日 00：00：00 000到当前系统时间的毫秒数。
* 1s = 1000ms
* */
public class DateTest02 {
    public static void main(String[] args) {
        //获取自1970年1月1日 00：00：00 000到当前系统时间的毫秒数。
         long nowTimeMillis =  System.currentTimeMillis();
         System.out.println(nowTimeMillis);

         //统计一个方法耗时
        //在调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
         print();
         //在调用完目标方法之后记录一个毫秒数
        long end = System.currentTimeMillis();
        System.out.println("耗费时长" + (end - begin) + "毫秒");
    }

    //要求：统计一个方法执行所耗费的时长
    public static void print(){
        for (int i=0;i<1000;i++){
            System.out.println("i=" + i);
        }
    }
}
