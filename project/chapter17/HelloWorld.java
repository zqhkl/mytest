/*
    ����Java�����е�package��import���ƣ�
	   1��ΪʲôҪʹ��package?
	      package��Java�еİ����ơ������Ƶ�������Ϊ�˷������Ĺ���
		  ��ͬ���ܵ���ֱ����ڲ�ͬ�İ��¡������չ��ܻ��ֵģ���ͬ����������в�ͬ�Ĺ��ܡ���

	   2��package��ô�ã�
	      package��һ���ؼ��֣�����Ӱ��������磺
		  package com.bjpowernode.javase.chapter17;
		  ע�⣺package���ֻ���������JavaԴ����ĵ�һ�С�

	   3��������û�������淶����
	      һ�㶼���ù�˾��������ķ�ʽ������Ϊ��˾��������ȫ��Ψһ�ԡ���
		  ���������淶��
		      ��˾�������� + ��Ŀ�� + ģ���� + ������

	   4�����ڴ���package��Java������ô���룿��ô���У�
	      
		  ����֮ǰ�ı�������в����ˡ�
          ���������ǣ�HelloWorld�ˡ�
		  �����ǣ�com.bjpowernode.javase.chapter17.HelloWorld

	      ���룺
		      javac -d . HelloWorld.java
			  �������£�
			    javac    ������������
				-d       ��������
				.        �������֮�����ɵĶ����ŵ���ǰĿ¼�£�.����ǰĿ¼��
				HelloWorld.java   �������Java�ļ�����
        
		  ���У�
		       java com.bjpowernode.javase.chapter17.HelloWorld

	   5������import��ʹ�á�
	      importʲôʱ��ʹ�ã�
             A����ʹ��B�ࡣ
			 A��B�඼��ͬһ�����¡�����Ҫimport��
			 A��B�಻��ͬһ�����¡���Ҫʹ��import��
			 Java.lang.*;������µ��಻��Ҫʹ��import���롣

		  import��ô�ã�
		    import���ֻ�ܳ�����package���֮�£�class�������֮�ϡ�
			import��仹���Բ����Ǻŵķ�ʽ��
*/
package com.bjpowernode.javase.chapter17;
public class HelloWorld
{
	public static void main(String[] args){
	 System.out.println("Hello World");
	}
}