package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
* 关于集合遍历/迭代专题。（重点：五颗星*****）
* */
public class CollectionTest02 {
    public static void main(String[] args) {
        //注意：以下讲解的遍历方式/迭代方式，是所有Collection通用的一种方式。
        //在Map集合中不能用。在所有的Collection以及子类中使用。
        //创建集合对象
        Collection c = new ArrayList(); //后面的集合无所谓，主要看前面的Collection接口，怎么遍历/迭代。
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        //对集合Collection进行遍历/迭代
        //第一步：获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        //第二步:通过以上获取的迭代器对象开始迭代/遍历集合。
        /*
            以下两个方法是迭代器对象Iterator中的方法：
        * boolean hasNext() 如果仍有元素可以迭代，则返回 true。
          Object next() 返回迭代的下一个元素。
        * */
       /* boolean hasNext = it.hasNext();
        System.out.println(hasNext);
        if (hasNext == true){
            //不管你当初存进去什么，取出来统一都是Objct。
            Object obj = it.next();
            System.out.println(obj);
        }

       hasNext = it.hasNext();
        System.out.println(hasNext);
        if (hasNext == true){
            //不管你当初存进去什么，取出来统一都是Objct。
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if (hasNext == true){
            //不管你当初存进去什么，取出来统一都是Objct。
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if (hasNext == true){
            //不管你当初存进去什么，取出来统一都是Objct。
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if (hasNext == true){
            //不管你当初存进去什么，取出来统一都是Objct。
            Object obj = it.next();
            System.out.println(obj);
        }*/

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
