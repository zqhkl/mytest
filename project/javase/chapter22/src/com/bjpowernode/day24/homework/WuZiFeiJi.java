package com.bjpowernode.day24.homework;

/*
* 物资运输飞机，是武器，但是只能移动，不能攻击
* */
public class WuZiFeiJi extends Weapon implements Moveable{
    @Override
    public void move() {
        System.out.println("运输机起飞！");
    }
}
