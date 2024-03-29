/*
final修饰的变量，如果这个变量是一个"引用"会怎样？？？
   《重点》final修饰的变量只能赋一次值(万变不离其宗)
    "引用"是不是一个变量呢？  是。

	final修饰的引用：
	    该引用只能指向一个对象，并且它只能永远指向该对象,无法再指向其它对象。
		并且在该方法执行过程中，该引用指向对象之后，该对象不会被垃圾回收器回收。
		直到当前方法结束，才会释放空间。

		虽然final的引用指向对象A后，不能再重新指向对象B。
		但是对象A内部的数据可以被修改。
*/
public class FinalTest02
{
	public static void main(String[] args){
	   Person p1 = new Person(20);
	   System.out.println(p1.age);

	   //-------------------------------------------------------
	   //代码不管怎么变化，p也是一个变量。（只不过这里有一个特殊的名字:引用）
	   final Person p = new Person(30);
       // p = new Person(30);
	}
}
class Person
	{
		int age;
		public Person(){
		}
		public Person(int age){
		   this.age = age;
		}
	}