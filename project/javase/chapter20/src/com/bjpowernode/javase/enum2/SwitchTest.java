package com.bjpowernode.javase.enum2;

public class SwitchTest {
    public static void main(String[] args) {
        //switch语句支持枚举类型
        //switch也支持String、int
        //第一版本的JDK,只支持int
        //高版本的JDK,支持int,String,枚举。
        //byte short char也可以，因为存在自动类型转换。
        switch (Season.AUTUMN){
            case SPRING:
                System.out.println("春天"); break;
            case AUTUMN:
                System.out.println("秋天");
        }
    }
}
