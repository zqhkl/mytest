package com.bjpowernode.javase.arry;

/*
* 一维数组的深入，数组中存储的类型为：引用数据类型
* 对于数组来说，实际上只能存储Java对象的内存地址。数组中存储的每个元素是"引用"。
* */
public class ArrayTest07 {
    public static void main(String[] args) {

        int[] array = {1,2,3};
        for (int i =0;i<array.length;i++){
            /*int temp = array[i];
            System.out.println(temp);*/
            System.out.println(array[i]);
        }
        //创建一个Animal类型的数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};

        //对Animal数组进行遍历
        for (int i=0;i<animals.length;i++){
            /*Animal a = animals[i];
            a.move();*/
            animals[i].move();
        }

        //Animal数组中可以存放Cat类型的数据，因为Cat是一个Animal。
        //Cat是Animal的子类。
        animals[1]=new Cat();

        //创建一个Animal类型的数组，数组当中存储Cat和Bird
        Animal[] anis = {new Cat(),new Bird()};  //该数组中存储了两个对象的内存地址。
        for(int i =0;i<anis.length;i++){
            //调用子对象特有的方法的话，需要向下转型！！
            if (anis[i] instanceof Cat){
                Cat c = (Cat)anis[i];
                c.catchMouse();
            }
            else if(anis[i] instanceof Bird){
                Bird b = (Bird)anis[i];
                b.sing();
            }
        }


    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}

//商品类
class Product{

}

//Cat是子类
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！");
    }
    public void catchMouse(){ System.out.println("猫抓老鼠！");
    }
}

//Bird子类
class Bird extends Animal{
    public void move(){
        System.out.println("Bird Fly!");
    }
    public void sing(){
        System.out.println("鸟儿在歌唱！！");
    }
}
