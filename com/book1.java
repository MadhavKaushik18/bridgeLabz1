/*Library Book System: Create a Book class with attributes title, 
 * author, price, and availability. Implement a method to borrow a book.
*/
package com;
public class book1 {
	 private String title;
	    private String author;
	    private double price;
	    private boolean isAvailable;
	    public book1() {
	        this.title = "Untitled";
	        this.author = "Unknown";
	        this.price = 0.0;
	        this.isAvailable = true;
	    }
	    public book1(String title, String author, double price, boolean isAvailable) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.isAvailable = isAvailable;
	    }
	    public void borrowBook() {
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println("You have successfully borrowed \"" + title + "\".");
	        } else {
	            System.out.println("Sorry, \"" + title + "\" is currently not available.");
	        }
	    }
	    public void displayInfo() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.printf("Price: $%.2f%n", price);
	        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
	        System.out.println("--------------------------------");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book1 b1=new book1();
		b1.displayInfo();
		b1.borrowBook();
		b1.borrowBook();
		b1.displayInfo();

	}

}
