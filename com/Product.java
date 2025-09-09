/*Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
*/
package com;

public class Product {
	  private String productName;
	    private double price;

	    
	    private static int totalProducts = 0;

	   
	    public Product(String productName, double price) {
	        this.productName = productName;
	        this.price = price;
	        totalProducts++;
	    }
	    public void displayProductDetails() {
	        System.out.println("Product Name: " + productName);
	        System.out.printf("Price: $%.2f%n", price);
	    }
	    public static void displayTotalProducts() {
	        System.out.println("Total Products Created: " + totalProducts);
	    }

	public static void main(String[] args) {
		Product p1=new Product("Amul",50.00);
		Product p2=new Product("Vadilal",60.00);
		Product p3=new Product("kasata",100.00);
		p1.displayProductDetails();
		p2.displayProductDetails();
		p3.displayProductDetails();
		displayTotalProducts();
	}

}
