/*
  hashCode������
     ��Object�е�hashCode��������ô���ģ�
	   public native int hashCode();
	   ����������ǳ��󷽷�������native�ؼ��֣��ײ����c++����

	 hashCode()�������ص��ǹ�ϣ�룺
	   ʵ���Ͼ���һ��Java������ڴ��ַ��������ϣ�㷨���ó���һ��ֵ��
	   ����hashCode()����ִ�н�����Ե�ͬ����һ��Java������ڴ��ַ��
*/

public class Test07
{
	public static void main(String[] args){
	  Object o = new Object();
	  int hashCodeValue = o.hashCode();

	  //�����ڴ��ַ������ϣ�㷨ת����һ�����֡����Ե�ͬ�����ڴ��ַ��
	  System.out.println(hashCodeValue);
	}
}