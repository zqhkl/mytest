/*
  final
     1、final是Java语言中的关键字。
	 2、final表示最终的，不可变的。
	 
	 3、《重点》final修饰的变量？
	    final修饰的局部变量，一旦赋值不能重新赋值。
		
	 4、《重点》final修饰的方法？
	     final修饰的方法无法被覆盖，被重写。
	 5、《重点》final修饰的类？
         final修饰的类无法继承。

     6、《提示》final控制不了能不能调用的问题。final管的啥？
	    final修饰的表示是最后的，不能变的，不能改的。

	 重点：final修饰的变量只能赋一次值。
*/
public class FinalTest01
{
	public static void main(String[] args){
	  //局部变量
	 int i = 100;
	 i=200;

	 //局部变量
	 final int k =100;
	 //k=300;
	 
	 final int m;
	 m=200;
	// m=300;
	}
}

class A
{
}


//B类继承A类，相当于对A类的功能进行扩展。如果你不希望对A类型进行扩展。
//可以给A类加一个Final关键字，这样的话，A类就无法继承了。
/*
class B extends A{

}
*/
// 错误：无法从最终String进行继承
/*
class Mystring extends String
{
}
*/

class C
{
	public final void doSome(){
		System.out.println("C's doSome...");
	}
}

class D extends C
{
	/*
	public void doSome(){
		System.out.println("D's doSome...");
	}
     */
	
	 public static void main(String[] args){
	    //多态
		C c = new D();
	 }
}