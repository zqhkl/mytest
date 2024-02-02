public class Test05
{
	public static void main(String[] args){
	    User u1 = new User("zhangsan",new Address("北京","大兴区","1111"));
		User u2 = new User("zhangsan",new Address("北京","大兴区","1111"));
		System.out.println(u1.equals(u2));
	}
}

class User
{
   String name;
   Address addr;
   public User(){}
   public User(String name,Address addr){
         this.name = name;
		 this.addr =addr;
   }

   //重写equals方法
   //重写规则：当一个用户的用户名和家庭住址都相同，表示同一个用户。
   public boolean equals(Object obj){
        if(obj == null || !(obj instanceof User)){
		        return false;
		}
		if(obj == this)  return true;
		User u = (User)obj;
		if(this.equals(u) && this.addr.equals(u.addr))
			return true;
          return false;
   }
}

class Address
{
	String city;
	String street;
	String zipcode;
	public Address(){}
	public Address(String city,String street,String zipcode){
	        this.city = city;
			this.street = street;
			this.zipcode = zipcode;
	}

	//注意：这里并没有重写equals方法
	public boolean equals(Object obj){
	   if (obj == null || !(obj instanceof Address)) return false;
	   if(this == obj)  return true;
	   Address a =(Address)obj;
	   if(this.city.equals(a.city) && this.street.equals(a.street) && this.zipcode.equals(a.zipcode))
		   return true;
	   return false;
	}
}