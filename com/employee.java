package com;

public class employee {
	private static String CompanyName;
	private String name;
	private String designation;
	private final int id;
	private static int  totalemployees=0;
	employee(String name,String designation,int id){
		this.name=name;
		this.designation=designation;
		this.id=id;
		totalemployees++;
	}
	private static void displayTotalEmpoyees() {
		System.out.println("total empoyee:"+""+totalemployees);
	}
	  private static  void setcompanyName(String companyname) {
		 CompanyName=companyname;
	 }
	private void displaydetails(){
		if(this instanceof employee) {
			System.out.println("Employee Name: "+name);
			System.out.println("Designation: "+designation);
			System.out.println("Id: "+id);
		}
		else {
			System.out.println("Invalid Employee Details");
		}
		
	}
	
	public static void main(String[] args) {
		employee.setcompanyName("Google");
		employee e1=new employee("Madhav","Software Developer",798396544);
		e1.displaydetails();
		displayTotalEmpoyees();
		employee e2=new employee("Mohit","beldaar",12);
		displayTotalEmpoyees();
		e2.displaydetails();
	}

}
