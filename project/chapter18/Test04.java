public class Test04
{
	public static void main(String[] args){
	
	}
}

class Student
{
	//ѧ��
	int no;
	//����ѧУ
	String school;

	public Student(){}
	public Studeng(int no,String school){
	   this.no = no;
	   this.school = school;
	}

	//��дtoString����
	public String toString(){
	   return "ѧ��" + no + ",����ѧУ����" + school;
	}

	//��дequals����
	//���󣺵�һ��ѧ����ѧ����ȣ�����ѧУ��ͬʱ����ʾͬһ��ѧ����
	//˼�������equals����ô��д�أ�
	//equals�����ı�дģʽ���ǹ̶��ġ����Ӳ�ࡣ
	public boolean equals(Object obj){
	  if(obj == null ||!(obj instanceof Student)){
	     return false;
	  if (this == obj)  return true;
	  Student s = (Student)obj;
      if (this.no == s.no && this.school.equals(s.school)){
	     return true;
	  }
	  }
	}
}