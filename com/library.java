package com;

public class library {
	private static String libraryName;
	   private String title;
	   private String author;
	   private final String isbn; 
	   public library(String title, String author, String isbn) {
	       this.title = title;
	       this.author = author;
	       this.isbn = isbn;
	   }
	   public static void setLibraryName(String name) {
	       libraryName = name;
	   }
	   public static void displayLibraryName() {
	       System.out.println("Library Name: " + libraryName);
	   }
	   public void displayBookDetails() {
	       if (this instanceof library) {
	           System.out.println("Title: " + title);
	           System.out.println("Author: " + author);
	           System.out.println("ISBN: " + isbn);
	       } else {
	           System.out.println("The object is not an instance of the Book class.");
	       }
	   }
	   public String getTitle() {
	       return title;
	   }
	   public String getAuthor() {
	       return author;
	   }
	   public String getIsbn() {
	       return isbn;
	   }
	   public static void main(String[] args) {
	       library.setLibraryName("Madhuvan");
	       library.displayLibraryName();
	       library book1 = new library("Mahabharat", "Valmiki", "9785655");
	       book1.displayBookDetails();
	   }
	}
