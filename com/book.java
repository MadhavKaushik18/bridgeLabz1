/*Create a Book class with attributes title, author, and price.
 *  Provide both default and parameterized constructors.*/
package com;
import java.util.*;
public class book {
	String title;
	String Author;
	int price;
   book(){
    	title="Mahabharat";
    	Author="Valmiki";
    	price=20;
    }
    book(String title,String Author,int price){
    	this.title=title;
    	this.Author=Author;
    	this.price=price;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book k=new book("madhav","mohit",450);
		System.out.print(k.Author);

	}

}
