package com;

public class person {
	 private String name;
	    private int age;
	    public person() {
	        this.name = "Unknown";
	        this.age = 0;
	    }
	    public person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public person(person other) {
	        this.name = other.name;
	        this.age = other.age;
	    }
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1=new person("alice",56);
		p1.displayInfo();
		person p2=new person(p1);
		p2.displayInfo();
	}

}
