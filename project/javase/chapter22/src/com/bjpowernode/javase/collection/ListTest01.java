package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
* 测试List接口中常用的方法
*   1、List集合存储元素特点：有序可重复。
*           有序：List集合中的元素有下标。
*           从0开始，以1递增。
*           可重复：存储一个1，还可以再存储1.
*   2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法。
*       以下只列出List接口特有的常用的方法：
*           void add(int index,Object element)
*           Object get(index)
*           int indexOf(Object o)
*           int lastIndexOf(Object o)
*           Object remove(int index)
*           Object set(int index, E element)
*
*       以上几个方法不需要死记硬背，可以自己编写代码测试一下，理解一下。
*       以后开发的时候，还是要翻阅帮助文档。
*
 * */
public class ListTest01 {
    public static void main(String[] args) {
        //创建List类型的集合。
        //List myList = new LinkedList();
        //List myList = new Vector();
        List myList = new ArrayList();

        //添加元素
        myList.add("A");//默认都是向集合末尾添加元素。
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");

        //在列表的指定位置插入指定元素（第一个参数是下标）
        //这个方法使用不多，因为对于ArrayList集合来说效率比较低。
        myList.add(1,"KING");

        //迭代
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object elt = it.next();
            System.out.println(elt);
        }

        //根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);

        //因为有下标，所以List集合有自己比较特殊的遍历方式。
        //通过下标遍历.[List集合特有的方式，Set没有。]
        for (int i=0;i<myList.size();i++){
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        //获取指定对象第一次出现处的索引。
        System.out.println(myList.indexOf("KING"));//1

        //获取指定对象最后一次出现处的索引。
        System.out.println(myList.lastIndexOf("C"));//3

        //删除指定下标位置的元素
        //删除下标为0的元素
        myList.remove(0);
        System.out.println(myList.size()); //4

        //修改指定位置的元素
        myList.set(2, "sort");

        //遍历集合
        for (int i =0;i<myList.size();i++){
            Object obj = myList.get(i);
            System.out.println(obj);
        }
    }
}

/*
* 计算机英语：
*   增删改查这几个单词要知道：
*       增：add、save、new
*       删：delete、drop
*       改：update、set、modify
*       查：find、get、query、select
* */
