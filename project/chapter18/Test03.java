
/*
    Java���Ե��е��ַ���String��û����дtoString��������û����дequals������

	�ܽ᣺
	   1��String���Ѿ���д��equals�������Ƚ������ַ�������ʹ��==������ʹ��equals��
	   equals��ͨ�õġ�

	   2��String���Ѿ���д��toString������

	����ۣ�
	   Java��ʲô���͵����ݿ���ʹ�á�==���ж�
            Java�л����������ͱȽ��Ƿ���ȣ�ʹ��==

	   Java��ʲô���͵�������Ҫʹ��equals�ж�
	        Java�����е�������������ͳһʹ��equals�������ж��Ƿ���ȡ�

	   ���ǹ�ء�
*/

public class Test03
{
	public static void main(String[] args){
	  
	  //�󲿷�����£����������ķ�ʽ�����ַ����Զ���
	  String s1 = "hello";
	  String s2 = "abc";

	  //ʵ����StringҲ��һ���ࡣ�����ڻ����������͡�
	  //��ȻString��һ���࣬��ôһ�����ڹ��췽����
	  String s3 = new String("Test1");
	  String s4 = new String("Test1");
	  // new���Σ����������ڴ��ַ��s3������ڴ��ַ��s4������ڴ��ַ��ͬ��
	  // == �жϵ����ڴ��ַ��
	  //System.out.println(s3 == s4);  //false

	  //�Ƚ������ַ����ܲ���ʹ��˫�Ⱥţ�
	  //���ܣ��������equals������
	  //String���Ѿ���дequals�����ˡ�
	  System.out.println(s3.equals(s4));

	  //String����û����дtoString�����أ�
	  String x = new String("�����ڵ�");
	  //���Stringû����дtoString()��������������java.lang.String@ʮ�����Ƶĵ�ַ
	  //�������ԣ�String���Ѿ���д��toString����������
	  System.out.println(x.toString()); ///�����ڵ�
	  System.out.println(x); //�����ڵ�
	}
}