package com.bjpowernode3;  //���仯�ˡ�
import com.bjpowernode.User;

//User��com.bjpowernode���¡�
//Vip��com.bjpowernode3���¡�
//����Vip��User�����ࡣ
public class Vip extends User{
    //ʵ������
	public void shopping(){
	   //this��ʾ��ǰ����
	   System.out.println(this.age);
	   System.out.println(this.name);
	}
}
