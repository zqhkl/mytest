//�˿�\
public class Customer{
	//�˿�������һ���˵�
	//Custoer has a FoodMenu(��仰ʲô��˼���˿���һ���˵�)
	//��ס���Ժ����ܹ�ʹ�� has a �������ģ�ͳһ�����Եķ�ʽ���ڡ�
	private FoodMenu foodMenu;//��Ҫ���ɷ�װ�ĺ�ϰ��

	//���췽��
	public Customer(){
	}
    public Customer(FoodMenu foodMenu){
	   this.foodMenu = foodMenu;
	}

	//setter and getter
	public void setFoodMenu(FoodMenu foodMenu){
	   this.foodMenu = foodMenu;
	}
	public void getFoodMenu(FoodMenu foodMenu){
	   return foodMenu;
	}

	//�ṩһ����˵ķ���
	public void order(){
	  //���õ��˵�
	  //����get�����ò˵�
	 // FoodMenu fm = this.getFoodMenu;
	 //Ҳ���Բ�����get��������Ϊ�ڱ�����˽�е������ǿ��Է���
	  foodMenu.shiZiChaoJiDan();
	  foodMenu.yuXiangRouSi();
	}
}

/*
  Cat is a Animal,��������is a�ı�ʾ����������Ϊ�̳С�
  Customer has a FoodMenu,����������has a�ı�ʾ�������Ե���ʽ���ڡ�
*/

/*
class Address
{

}

class User
{
	String id;
	String name;
	Address addr;
}

class Myself{

}

class Friend{

}
*/