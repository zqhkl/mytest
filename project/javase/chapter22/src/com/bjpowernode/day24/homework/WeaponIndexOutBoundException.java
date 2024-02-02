package com.bjpowernode.day24.homework;

/**
 * 添加武器异常
 */
public class WeaponIndexOutBoundException extends Exception{
    public WeaponIndexOutBoundException(){

    }

    public WeaponIndexOutBoundException(String s){
        super(s);
    }
}
