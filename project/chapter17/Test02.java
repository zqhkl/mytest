package com;

public class Test02
{
	/*
	    Test02在com包下。
		HelloWorld在com.bjpowernode.javase.chapter17下。
		不在同一个package下，包名可以省略吗？
		  不能省略。
	*/
	public static void main(String[] args){
	   HelloWorld hw = new HelloWorld();
	   System.out.println(hw);
	}
}