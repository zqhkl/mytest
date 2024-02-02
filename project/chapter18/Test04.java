public class Test04
{
	public static void main(String[] args){
	
	}
}

class Student
{
	//学号
	int no;
	//所在学校
	String school;

	public Student(){}
	public Studeng(int no,String school){
	   this.no = no;
	   this.school = school;
	}

	//重写toString方法
	public String toString(){
	   return "学号" + no + ",所在学校名称" + school;
	}

	//重写equals方法
	//需求：当一个学生的学号相等，并且学校相同时，表示同一个学生。
	//思考：这个equals该怎么重写呢？
	//equals方法的编写模式都是固定的。架子差不多。
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