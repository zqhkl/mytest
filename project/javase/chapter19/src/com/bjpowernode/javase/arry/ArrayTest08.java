package com.bjpowernode.javase.arry;
/*
* 关于一维数组的扩容。
* 在Java开发中，数组长度一经确定不可变，那么数组满了怎么办？
*        数组满了，需要扩容。
*        Java中对数组的扩容是：
*              先新建一个大容量数组，然后将小容量数组中的数据一个一个拷贝到大数组当中。
* 结论：数组扩容效率较低。因为涉及到拷贝的问题。所以在以后的开发中请注意：尽可能少的进行数组的拷贝。
* 可以在创建数组对象的时候预估计以下多少合适，最好预估准确，这样可以减少数组的扩容次数。提高效率。
* */
public class ArrayTest08 {
    public static void main(String[] args) {
        //Java中的数组是怎样进行拷贝的呢？
        //System.arraycopy(5个参数);

        //拷贝源（从这个数组中拷贝）
        int[] src = {1,11,22,3,4};

        //拷贝目标（拷贝到这个目标数组上）
        int[] dest=new int[20];  //动态初始化一个长度为20的数组，每一个元素默认值0
        //调用JDK System类中的arraycopy方法，来完成数组的拷贝
        //System.arraycopy(src,1,dest, 3, 2);

        //遍历目标数组
       /* for (int i=0;i<dest.length;i++)
            System.out.println(dest[i]);*/

        System.arraycopy(src,0,dest, 0, src.length);
        for (int i=0;i<dest.length;i++)
            System.out.println(dest[i]);

        //数组中如果存储的元素是引用，可以拷贝吗？当然可以。
        String[] strs = {"hello","world","study","java","oracle","mysql","jdbc"};
        String[] newStrs = new String[20];
        System.arraycopy(strs, 0,newStrs , 0, strs.length);
        for (int i=0;i<dest.length;i++)
            System.out.println(newStrs[i]);

        Object[] objs = {new Object(),new Object(),new Object()};
        Object[] newObjs = new Object[10];
        System.arraycopy(objs, 0, newObjs, 0, objs.length);
        for (int i =0;i<newObjs.length;i++)
            System.out.println(newObjs[i]);
    }
}
