package com.bjpowernode.javase.collection;



import java.util.TreeSet;

/*
* 1、 TreeSet集合底层实际上是一个TreeMap
* 2、 TreeMap集合底层是一个二叉树
* 3、 放到TreeSet集合中的元素，等同于放到了TreeMap集合key部分。
* 4、 TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序。
*     称为：可排序集合。
* */
public class TreeSetTest02 {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<String> ts = new TreeSet<>();
        //添加String
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhangsi");
        ts.add("wangliu");
        //遍历
        for (String s: ts){
            //按照字典顺序，升序!
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(200);
        ts2.add(900);
        ts2.add(100);
        ts2.add(800);
        ts2.add(10);
        ts2.add(60);
        for (Integer elt :ts2){
            //升序！
            System.out.println(elt);
        }
    }
}

/*
* 数据库中有很多数据：
*   userid      name        birth
* -----------------------------------
*   1           zs          1980-11-11
*   2           ls          1987-11-11
*   3           ww          1990-11-11
*   4           zl          199-11-1
*
*   编写程序从数据库当中取出数据，在页面栈是用户信息的时候按照生日升序或者降序。
*   这个时候可以使用TreeSey集合，因为TreeSet集合放进去，拿出来就是有顺序的。
* */