/*
   ����Object���е�equals����
      1��equals������Դ���룺
	     public boolean equals(Object obj){
		  return ��this == obj);
		 }
		 �������������Object���Ĭ��ʵ�֡�
		     

	  2��SUN��˾���euqals������Ŀ����ʲô��
	     �Ժ��̵Ĺ��̵��ж�Ҫͨ��equals�������ж����������Ƿ���ȡ�
		 equals�����������ж����������Ƿ���ȵġ�

	  3��������Ҫ�о�����Object��������Ĭ�ϵ�equals�����������ã�����
	      ��Object���е�equals�������У�Ĭ�ϲ��õ��ǡ�==���ж�����Java����
	      �Ƿ���ȡ�����==���жϵ�������Java������ڴ��ַ������Ӧ���ж�����
		  Java����������Ƿ���ȡ����������ڵ�equals���������á�
		  ��Ҫ������дequals��
	     
	  4���ж�����Java�����Ƿ���ȣ�����ʹ�á�==������Ϊ��==���Ƚϵ�����������
	  ���ڴ��ַ��
*/

public class Test02
{
	public static void main(String[] args){

	  //�ж����������������͵������Ƿ����ֱ��ʹ�á�==�����С�
	   int a =100;
	   int b =100;
	   //�����==���������ж�a�б����100��B�б����100�Ƿ���ȡ�
	   System.out.println(a == b); //True

	  //�ж�����Java�����Ƿ���ȣ�������ô��?��ֱ��ʹ�á�==����
	  //����һ�����ڶ����ǣ�2008��8��8�ա�
	  MyTime t1 = new MyTime(2008,8,8);  // MyTime t1 = ox1234;
	  //������һ���µ����ڶ��󣬵���ʾ������Ҳ�ǣ�2008��8��8�ա�
	  MyTime t2 = new MyTime(2008,8,8);//MyTime t2 = 0x3698;

	  //�������£��Ƚ����������Ƿ���ȣ��ܲ���ʹ�á�==��������
	  //�����˫�Ⱥ��жϵ��ǣ�t1�б���Ķ����ڴ��ַ��t2�б���Ķ����ڴ��ַ�Ƿ���ȡ�
	  System.out.println(t1 == t2);  //false

	  //��дObject equals����֮ǰ���Ƚϵ��Ƕ����ڴ��ַ��
	  /*
	   boolean flag = t1.equals(t2);
	   System.out.println(flag); //false
	   */

	    //��дObject equals����֮�󣨱Ƚϵ������ݡ���
	   boolean flag = t1.equals(t2);
	   System.out.println(flag);  //true

	   //�ٴ���һ���µ�����
	   MyTime t3 = new MyTime(2008,8,9);
	   //�������ڲ���ȣ�����false��
	   System.out.println(t1.equals(t3));

	   //�������������bug�� �������У�����Ч����ô�����ͣ���ô���졣��
	   MyTime t4 = null;
	   System.out.println(t1.equals(t4));  //false
	}
} 

class MyTime      //extends Object
{
	 int year;
	 int month;
	 int day;
	public MyTime(){
	
	}
	public MyTime(int year,int month,int day){
	   this.year = year;
	   this.month = month;
	   this.day = day;
	}
  
  //Ĭ�ϵ�equals����
  /*
    public boolean equals(Object obj){
		  return ��this == obj);
	}
  */
 
  //��дObject���equals����
  //��ô��д������ճ������ͬ�ķ���ֵ���͡���ͬ�ķ���������ͬ����ʽ�����б�
  //equals����Ӧ����ô��д�����Լ���������Ϊ��������ʲô��ȵ�ʱ���ʾ��ȣ������ôд��

   public boolean equals(Object obj){
		 //������ͬ������ͬ��������Ҳ��ͬ��ʱ�򣬱�ʾ����������ͬ������������ȡ�
		 //��ȡ��һ�����ڵ�������
		 int year1 = this.year;
		 int month1= this.month;
		 int day1 = this.day;

		 //��ȡ�ڶ������ڵ�������
		 /*
		 int year2 = obj.year;
		 int month2 = obj.month;
		 int day2  = obj.day;
		 */
		 if (obj instanceof MyTime)
		 {
			 MyTime t = (MyTime)obj;
			int year2 = t.year;
		    int month2 = t.month;
		    int day2  = t.day;
			if (year1 == year2 && month1 == month2 && day1 == day2)
			{
				return true;
			}
		 }
		 //�����ܹ�ִ�е��˴���ʾ���ڲ���ȡ�
		 return false;
	}
}

/*
class Person
{
	private String idCard;
}
*/
