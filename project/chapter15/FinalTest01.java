/*
  final
     1��final��Java�����еĹؼ��֡�
	 2��final��ʾ���յģ����ɱ�ġ�
	 
	 3�����ص㡷final���εı�����
	    final���εľֲ�������һ����ֵ�������¸�ֵ��
		
	 4�����ص㡷final���εķ�����
	     final���εķ����޷������ǣ�����д��
	 5�����ص㡷final���ε��ࣿ
         final���ε����޷��̳С�

     6������ʾ��final���Ʋ����ܲ��ܵ��õ����⡣final�ܵ�ɶ��
	    final���εı�ʾ�����ģ����ܱ�ģ����ܸĵġ�

	 �ص㣺final���εı���ֻ�ܸ�һ��ֵ��
*/
public class FinalTest01
{
	public static void main(String[] args){
	  //�ֲ�����
	 int i = 100;
	 i=200;

	 //�ֲ�����
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


//B��̳�A�࣬�൱�ڶ�A��Ĺ��ܽ�����չ������㲻ϣ����A���ͽ�����չ��
//���Ը�A���һ��Final�ؼ��֣������Ļ���A����޷��̳��ˡ�
/*
class B extends A{

}
*/
// �����޷�������String���м̳�
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
	    //��̬
		C c = new D();
	 }
}