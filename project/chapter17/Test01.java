package com.bjpowernode.javase.chapter17;

public class Test01
{
	public static void main(String[] args){
	  //����HelloWorld����
	  //HelloWorld������������com.bjpowernode.javase.chapter17.HelloWorld
	  com.bjpowernode.javase.chapter17.HelloWorld hw = new com.bjpowernode.javase.chapter17.HelloWorld();
	  System.out.println(hw);

	  //��������ʡ����
	  //˼��������İ���֮���Կ���ʡ�ԣ�����ΪHelloWorld��Test01��ͬһ��package�¡�
	  HelloWorld hw2 = new HelloWorld();
	  System.out.println(hw2);
	}
}