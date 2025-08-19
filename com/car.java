/* Create a class Car with instance variables model and year. 
Create two car objects and display their details.*/
 class car1{
	String model;
	int year;
}
public class car{
	public static void main(String[] args) {
		car1 c1=new car1();
		car1 c2=new car1();
		c1.model="maruti";
		c2.model="toyota";
		c1.year=2020;
		c2.year=2021;
		System.out.print(c1.model+"  "+c1.year);
	}
}
