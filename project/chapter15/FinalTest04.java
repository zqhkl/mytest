/*
  上一个例子的结论：
      final修饰的实例变量，必须手动赋值。
	  《重点》final修饰的变量，只能赋一次值。

  final修饰的实例变量一般添加static修饰。

  终极结论：
     static final修饰的变量成为“常量”。
	 常量名建议全部大写。每个单词之间采用下划线衔接。

  常量：实际上常量和静态变量一样，区别在于：
     常量的值不能变。

	 常量和静态变量，都是存储在方法区，并且都是在类加载时初始化。

	 常量一般都是公开的：public的。
*/

public class FinalTest04
{
	public static void main(String[] args){
	   System.out.println(Chinese.COUNTRY);
	}
}

class Chinese
{
	//身份证号，每个人都不一样，对象级别的
	String idCard;
	//姓名， 对象不同姓名不一样。
	String name;
    //国家的值是一个固定值：“中国”
	//实例变量在堆中，一个对象一份。100个对象100份。
	//实例变量既然使用final修饰了，说明该实例变量的值不会随着对象的变化而变化。
	//该实例变量前面应该添加：static关键字，变为静态的，存储在方法区。
	public static final String COUNTRY = "中国";
    
	//i永远是10，创建100个对象，i也是10.
	//i是10是永远不会改变的，既然这样，没必要声明你贵为实例变量，最好是静态的。节省内存。
	static final int I = 10;
}

class MyMath
{   
	//数学中的Π是永远不会变的。
	public static final double PI = 3.1415926;
}