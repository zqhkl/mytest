package com.bjpowernode.javase.enum2;

/*
* 这个案例没有使用Java中的枚举，分析以下程序，在设计方面有什么缺陷？
*       以下代码可以编译，也可以运行。这些都没有问题。
*       就是设计上你觉得有什么缺陷。
* */
public class EnumTest01 {
    public static void main(String[] args) {
      boolean success =  divide(10, 2);
        System.out.println(success? "计算成功":"计算失败");
    }

    /*
    * 以下程序计算两个Int类型数据的商，计算成功返回1，计算失败返回0。
    * */
    //设计缺陷：在这个方法的返回值类型上。返回一个int不恰当。
    //既然最后的结果只是成功和失败，最好使用布尔类型。因为布尔类型true和false正好可以表示两种不同的状态。

    //这种设计不错
    public static boolean divide(int a,int b){
        try{
            int c = a / b;
            //返回10已经偏离了需求，实际上已经出错了，但是编译器没有检查出来。
            //我们一直想追求的是：所有的错误尽可能让编译器找出来，所有的错误越早发现越好！
            return true;

        }catch(Exception e){
            //程序执行到此处表示以上程序出现了异常！
            //表示执行失败！
            return false;
        }
    }

    /*
    * 思考：以上的这个方法设计的没毛病，挺好，返回true和false表示两种情况，
    * 但是在以后的开发中，有可能遇到一个方法的执行结果可能包括三种情况，
    * 四种情况，五种情况不等，但是每一个都是可以数清楚的，一枚一枚都是可以
    * 列举出来的。这个布尔类型就无法满足需求了。此时需要枚举类型。
    * */
}
