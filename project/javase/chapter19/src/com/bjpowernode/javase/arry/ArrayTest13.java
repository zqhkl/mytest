package com.bjpowernode.javase.arry;
//Object[] 这是一个万能的口袋，这个口袋中可以装任何引用数据类型的数据。
public class ArrayTest13 {
    public static void main(String[] args) {
        //注意：“abc”这是一个字符串对象，字符串在Java中有优待，不需要new也是一个对象。
        //"abc"字符串也是Java对象，属于String类型。
        Object[] arr = {new Husband(),new Wife(),"abc"};
    }
}

class Husband {

}

class Wife{

}
