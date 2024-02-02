/*
  hashCode方法：
     在Object中的hashCode方法是怎么样的？
	   public native int hashCode();
	   这个方法不是抽象方法，带有native关键字，底层调用c++程序。

	 hashCode()方法返回的是哈希码：
	   实际上就是一个Java对象的内存地址，经过哈希算法，得出的一个值。
	   所以hashCode()方法执行结果可以等同看作一个Java对象的内存地址。
*/

public class Test07
{
	public static void main(String[] args){
	  Object o = new Object();
	  int hashCodeValue = o.hashCode();

	  //对象内存地址经过哈希算法转换的一个数字。可以等同看作内存地址。
	  System.out.println(hashCodeValue);
	}
}