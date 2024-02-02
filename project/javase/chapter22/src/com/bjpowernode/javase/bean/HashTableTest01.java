package com.bjpowernode.javase.bean;

import java.util.Hashtable;
import java.util.Map;

/*
* Hashtable的key可以为null吗？
*   Hashtable的key和value都是不能为null的。
*   HashMap集合的key和value都是可以为null的。
* Hashtable方法都带有synchronized:线程安全的。
* 线程安全有其它的方案，这个Hashtable对线程的处理
* 导致效率较低，使用较少了。
*
* Hashtable和HashMap一样，底层都是哈希表数据结构。
* Hashtable的初始化容量是11，默认加载因子是0.75f。
* Hashtable的扩容是：原容量 * 2 + 1
* */
public class HashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();

        //map.put(null, "123");
        map.put(100, null);
    }
}
