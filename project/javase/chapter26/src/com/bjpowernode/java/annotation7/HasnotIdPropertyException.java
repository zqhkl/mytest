package com.bjpowernode.java.annotation7;

/*
自定义异常
 */
public class HasnotIdPropertyException  extends RuntimeException{
    public HasnotIdPropertyException(){}
    public HasnotIdPropertyException(String s){
        super(s);
    }
}
