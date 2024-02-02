//顾客\
public class Customer{
	//顾客手里有一个菜单
	//Custoer has a FoodMenu(这句话什么意思：顾客有一个菜单)
	//记住：以后凡是能够使用 has a 来描述的，统一以属性的方式存在。
	private FoodMenu foodMenu;//都要养成封装的好习惯

	//构造方法
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

	//提供一个点菜的方法
	public void order(){
	  //先拿到菜单
	  //调用get方法拿菜单
	 // FoodMenu fm = this.getFoodMenu;
	 //也可以不调用get方法，因为在本类中私有的属性是可以访问
	  foodMenu.shiZiChaoJiDan();
	  foodMenu.yuXiangRouSi();
	}
}

/*
  Cat is a Animal,但凡满足is a的表示都可以设置为继承。
  Customer has a FoodMenu,但凡是满足has a的表示都以属性的形式存在。
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