/*
  �ӿڣ�
     1���ӿ�Ҳ��һ�֡������������͡�������֮��Ҳ��һ��class�ֽ����ļ���
	 2���ӿ�����ȫ����ġ����������ǰ���󡣣�����Ҳ����˵�ӿ�������ĳ����ࡣ
	 3���ӿ���ζ��壬�﷨��ʲô��
	 [���η��б�] interface �ӿ���{}
	 4���ӿ�֧�ֶ�̳У�һ���ӿڿ��Լ̳ж���ӿڡ�
	 5���ӿ���ֻ�������������ݣ�һ�����ǣ�������һ�����ǣ����󷽷����ӿ���û�����������ˣ�ֻ�����������֡�
	 6���ӿ������е�Ԫ�ض���public���εġ������ǹ����ġ���
	 7���ӿ��еĳ��󷽷�����ʱ��public abstract���η�����ʡ�ԡ�
	 8���ӿ��еķ������ǳ��󷽷������Խӿ��еķ��������з����塣
	 9���ӿ��еĳ���public static final����ʡ�ԡ�
*/

public class Test01
{
	public static void main(String[] args){
	 System.out.println(MyMath.PI);
	}
}

//����ӿ�
interface A
{

}

//�ӿ�֧�ּ̳�
interface B extends A
{

}

//һ���ӿڿ��Լ̳ж���ӿڣ�֧�ֶ�̳У�
interface C extends A,B
{

}

//�ҵ���ѧ�ӿ�
interface MyMath
{ 
	//����
	//public static final double PI = 3.1415926;
	//public static final����ʡ���� ����
	double PI = 3.1415926;

	//���󷽷�
	//public abstract int sum(int a,int b);

	//�ӿڵ��м�Ȼ���ǳ��󷽷�����ô�ڱ�д�����ʱ��public abstract����ʡ����
	int sum(int a,int b);

	//�ӿ��еķ��������з�������
	//����: �ӿڳ��󷽷����ܴ�������
	//void doSome(){}

	//����ĳ��󷽷�
	int sub(int a,int b);
}

