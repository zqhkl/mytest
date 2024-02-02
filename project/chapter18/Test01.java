/*
  关于Object类中的toString()方法
    1、源代码长什么样？
	   public String toString(){
	     return getClass.getName() + "@" + Integer.toHexString(hashCode()); 
	   }
	   源代码上toString()方法的默认实现是：
	       类名@对象的内存地址转换为
    2、SUN公司设计toString()方法的目的是什么？
	   toString()方法的作用是什么？ 
	      toString()方法设计的目的是：通过调用这个方法可以将“Java对象”转换成“字符串”的形式。
    3、其实SUN公司开发Java语言的时候，建议所有的子类都去重写toString()方法。
	toString()方法应该是一个简洁的、详实的、易阅读的。
*/

public class Test01
{
	public static void main(String[] args){
	 MyTime t1 = new MyTime(1970,1,1);
	 String s1 = t1.toString();
	 //MyTime类重写toString()方法之前
	 System.out.println(s1);  //MyTime@15db9742
	 
	 //MyTime类重写toString()方法之后
	 System.out.println(s1);  //1970年1月1日

	 //注意：输出引用的时候，会自动调用该引用的toString()方法。
	 System.out.println(t1);
	}
}

class MyTime
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

	//重写toString()方法
	//这个toStirng()方法怎么重写呢？
	//越简洁越好，可读性越强越好。
	//向简洁的、详实的、易阅读的方向发展
	public String toString(){
	   return this.year + "年" + this.month + "月" + this.day + "日";
	}
}