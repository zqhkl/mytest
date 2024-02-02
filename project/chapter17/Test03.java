package com.jbpowernode.javase.chapter17;
import java.util.Scanner;
public class Test03
{
	public static void main(String[] args){
	  //为什么要这样写？
	  //Test03类和Scanner类不在同一个包下。
	  //java.util就是Scanner类的包名。
	  //java.util.Scanner s = new java.util.Scanner(System.in);

	  Scanner s = new Scanner(System.in);
	  String str = s.next();
	  System.out.println("请输入的字符串是：" + str);
	}
}