package oopsen;

public class Product {
	public static void main(String[] args) {
		customer c1=new Regularcustomer("2315001279","Madhav","madhavkaushik204216@gmail.com");
		product1 p1=new product1("301","Bomb",499.99);
		order o1=new order(c1,p1,12);
		o1.displaydetails();
	}
	

}
class customer{
	private String customerId;
	private String Name;
	private String emailId;
	public customer(String Id,String name,String eId) {
		this.customerId=Id;
		this.Name=name;
		this.emailId=eId;
	}
	public String getcustomerId() {
		return customerId;
		}
	public String getcustomerName() {
		return  Name;
		}
	public String getemailId() {
		return emailId;
		}
	public double discount() {
		return 0.0;
	}
	
}
class Regularcustomer extends customer{
	Regularcustomer(String id,String name,String emailId){
		super(id,name,emailId);
	}
	public double discount() {
		return 0.05;
	}
	
}
class premiumcustomer extends customer{
	premiumcustomer(String id,String name,String emailId){
		super(id,name,emailId);
	}
	public double discount() {
		return 0.15;
	}
	
}

class product1{
	private String productId;
	private String productName;
	 private double Price;
	product1(String productId,String productName,double Price){
		this.productId=productId;
		this.productName=productName;
		this.Price=Price;
	}
	public String getId() {
	return productId;
	}
	public String getName() {
		return productName;
	}
	public void setprice(double Price) {
		this.Price=Price;
	}
	public double getPrice() {
		return Price;
	}
}
class order{
	private customer Customer;
	private product1 Product1;
	private int quantity;
	public order(customer c1,product1 p1,int q){
		this.Customer=c1;
		this.Product1=p1;
		this.quantity=q;
	}
	public double totalprice() {
		double total=Product1.getPrice()*quantity *(1- Customer.discount());
		return total;}
	public void displaydetails() {
		System.out.println("customer name: "+Customer.getcustomerName());
		System.out.println("customer Id :"+Customer.getcustomerId());
		System.out.println("customer email: "+Customer.getemailId());
		System.out.println("product Name: "+Product1.getName());
		System.out.println("Product id: "+Product1.getId());
		System.out.println("Product price: "+Product1.getPrice());
		System.out.println("Total amount: "+totalprice());
		
	}
	
}
