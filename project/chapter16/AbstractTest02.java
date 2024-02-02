/*
   抽象类:
     1、抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中。
	 2、重要结论：重要结论五颗星*****（必须记住）
	    一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现了。
		这是Java语法上强行规定的，必须的，不然编译器就报错了。
		
		这里的覆盖或者说重写，也可以叫做实现。（对抽象的实现）
*/
public class AbstractTest02
{
	public static void main(String[] args){
	//能不能使用多态？
	//父类型引用指向子类型对象。
	Animal a = new Bird();  //向上转型
	//这就是面向抽象便程。
	//以后你都是调用a.xxxx
	//a的类型是Animal,Animal是抽象的
	//面向抽象便程，不要面向具体编程，降低程序的耦合度，提高程序的扩展力。
	//这种编程思想符合OCP原则。
	/*
	   分析以下：
	      编译的时候这个move()方法是谁的？
		  运行的时候这个move()方法又是谁的？
	*/
	a.move();
	}
}

//动物类
abstract class Animal
{
	//抽象方法
	public abstract void move();
 
}

//子类（非抽象的）
class Bird extends Animal
{
   //需要将从父类中继承过来的抽象方法进行覆盖/重写，或者也可以叫做“实现”。
   //把抽象的方法实现了。
   public void move(){
   
   }
}

//如果Bird是抽象的话，那么这个Animal中继承过来的抽象方法也可以不去重写/覆盖/实现。
abstract class Bird extends Animal
{

}

/*
   有些内容不要死记硬背，讲讲道理。
   分析：
     Animal是父类，并且是抽象的。
	 Animal这个抽象类中有一个抽象方法move.

	 Bird是子类并且是非抽象的。
	 Bird继承Animal之后，会将抽象方法继承过来。
*/