package com.bjpowernode3;  //包变化了。
import com.bjpowernode.User;

//User在com.bjpowernode包下。
//Vip在com.bjpowernode3包下。
//但是Vip是User的子类。
public class Vip extends User{
    //实例方法
	public void shopping(){
	   //this表示当前对象
	   System.out.println(this.age);
	   System.out.println(this.name);
	}
}
