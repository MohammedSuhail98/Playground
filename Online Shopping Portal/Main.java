public class Main {
	public static void main(String[] args) {
		Customers cObj1 = new Customers(1001,"Saakshi",9000000000L,"Bangalore","16-Jul-1990",'F',"Lakshmi Kajal,Salwar");
    cObj1.display();
      Customers cObj2 = new Customers(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992",'M',"T-Shirt,Jeans");
      cObj2.display();
      Suppliers sObj1 = new Suppliers(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75f);
      sObj1.display();
      Suppliers sObj2 = new Suppliers(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35f);
      sObj2.display();
      cObj1.editAddress();
      sObj1.editAddress();
      sObj1.incStock();
      sObj2.incStock();
      
    }	
}

class Users {
	int id;
  String name;
  long mob;
  String address;
   public void display()
  {
    System.out.println(name + ", " + mob );
  }
  void editAddress()
  {
    System.out.println(name + ", " + address);
    if( address.equals("Bangalore"))
    {System.out.println(name + ", " + "Coimbatore");}
    else
    { System.out.println(name + ", " + "Delhi");
    System.out.println("Order placed successfully!");}
  }
}

class Customers extends Users{
  String dob;
  char gender;
  String order;
public Customers(int id, String name, long mob, String address, String dob, char gender, String order)
{
  this.id = id;
  this. name= name;
  this .mob= mob;
  this .address = address;
  this .dob = dob;
  this .gender = gender;
  this .order = order;
}

}

class Suppliers extends Users {
		int stock;
  String status;
  float rating;
  public Suppliers(int id, String name, long mob, String address, int stock, String status, float rating)
{
  this.id = id;
  this. name= name;
  this .mob= mob;
  this .address = address;
  this .stock = stock;
  this .status = status;
  this .rating= rating;
}
  void incStock()
  {
    if(name.equals("ABC Traders"))
    {
      this.stock+=5;
    }
    else
    {
      this.stock+=10;
    }
    System.out.println(name + ", " + stock);
}}




