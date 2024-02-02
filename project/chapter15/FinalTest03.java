/*
   final修饰的实例变量呢？
   《重点：万变不离其宗》：final修饰的变量只能赋值一次。（这句话到哪里都好使。）

   你是否还记得：实例变量如果没有手动赋值的话，系统会赋默认值。

   Java程序设计：不背锅！！！甩锅甩的很好！！！！

   实例变量在什么时候赋值（初始化）？
      构造方法执行的过程中赋值。（new的时候赋值）
   终极结论：
      final修饰的实例变量，系统不管赋默认值，要求程序员必须手动赋值。
	  这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以。

*/

public class FinalTest03
{
	public static void main(String[] args){
	
	}
}

class User
{
	//实例变量
	//编译器报错
	//final int age;
    
	//实例变量
	//可以，因为程序员手动赋值了。
	final double height = 1.8;

	//以下这一堆代码全部联合起来，weight变量也是赋值了一次。
	//实例变量
	final double weight;

	//构造方法
	public User(){
		System.out.println("Hello World!");
	  this.weight = 80;   //只要我赶在系统赋默认值之前赋值就行。
	 // this.weight = 81;  //这个可以吗？ 这个不行。
	}

}