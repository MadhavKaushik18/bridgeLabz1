import java.util.*;
public class class0bj {
	

	

	    // 1. Program to Display Employee Details
	    static class Employee {
	        String name;
	        int id;
	        double salary;
	        Employee(String name, int id, double salary) {
	            this.name = name;
	            this.id = id;
	            this.salary = salary;
	        }
	        void display() {
	            System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
	        }
	    }

	    // 2. Program to Compute Area of a Circle
	    static class Circle {
	        double radius;
	        Circle(double radius) {
	            this.radius = radius;
	        }
	        double area() {
	            return Math.PI * radius * radius;
	        }
	        double circumference() {
	            return 2 * Math.PI * radius;
	        }
	        void display() {
	            System.out.println("Radius: " + radius + ", Area: " + area() + ", Circumference: " + circumference());
	        }
	    }

	    // 3. Program to Handle Book Details
	    static class Book {
	        String title, author;
	        double price;
	        Book(String title, String author, double price) {
	            this.title = title;
	            this.author = author;
	            this.price = price;
	        }
	        void display() {
	            System.out.println("Book: " + title + ", Author: " + author + ", Price: " + price);
	        }
	    }

	    // 4. Program to Track Inventory of Items
	    static class Item {
	        int itemCode;
	        String itemName;
	        double price;
	        Item(int itemCode, String itemName, double price) {
	            this.itemCode = itemCode;
	            this.itemName = itemName;
	            this.price = price;
	        }
	        void display(int qty) {
	            System.out.println("Item: " + itemName + ", Code: " + itemCode + ", Price: " + price + ", Qty: " + qty + ", Total: " + (price * qty));
	        }
	    }

	    // 5. Program to Handle Mobile Phone Details
	    static class MobilePhone {
	        String brand, model;
	        double price;
	        MobilePhone(String brand, String model, double price) {
	            this.brand = brand;
	            this.model = model;
	            this.price = price;
	        }
	        void display() {
	            System.out.println("Mobile: " + brand + " " + model + ", Price: " + price);
	        }
	    }

	    // 6. Program to Simulate Student Report
	    static class Student {
	        String name;
	        int rollNumber;
	        int marks;
	        Student(String name, int rollNumber, int marks) {
	            this.name = name;
	            this.rollNumber = rollNumber;
	            this.marks = marks;
	        }
	        String grade() {
	            if (marks >= 90) return "A";
	            else if (marks >= 75) return "B";
	            else if (marks >= 50) return "C";
	            else return "D";
	        }
	        void display() {
	            System.out.println("Student: " + name + ", Roll: " + rollNumber + ", Marks: " + marks + ", Grade: " + grade());
	        }
	    }

	    // 7. Program to Simulate an ATM
	    static class BankAccount {
	        String accountHolder;
	        int accountNumber;
	        double balance;
	        BankAccount(String accountHolder, int accountNumber, double balance) {
	            this.accountHolder = accountHolder;
	            this.accountNumber = accountNumber;
	            this.balance = balance;
	        }
	        void deposit(double amt) {
	            balance += amt;
	        }
	        void withdraw(double amt) {
	            if (amt <= balance) balance -= amt;
	            else System.out.println("Insufficient balance");
	        }
	        void display() {
	            System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
	        }
	    }

	    // 8. Program to Check Palindrome String
	    static class PalindromeChecker {
	        String text;
	        PalindromeChecker(String text) {
	            this.text = text;
	        }
	        boolean isPalindrome() {
	            String rev = new StringBuilder(text).reverse().toString();
	            return text.equalsIgnoreCase(rev);
	        }
	        void display() {
	            System.out.println(text + (isPalindrome() ? " is Palindrome" : " is not Palindrome"));
	        }
	    }

	    // 9. Program to Model a Movie Ticket Booking System
	    static class MovieTicket {
	        String movieName;
	        int seatNumber;
	        double price;
	        MovieTicket(String movieName, int seatNumber, double price) {
	            this.movieName = movieName;
	            this.seatNumber = seatNumber;
	            this.price = price;
	        }
	        void display() {
	            System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: " + price);
	        }
	    }

	    // 10. Program to Simulate a Shopping Cart
	    static class CartItem {
	        String itemName;
	        double price;
	        int quantity;
	        CartItem(String itemName, double price, int quantity) {
	            this.itemName = itemName;
	            this.price = price;
	            this.quantity = quantity;
	        }
	        void addItem(int qty) {
	            quantity += qty;
	        }
	        void removeItem(int qty) {
	            if (qty <= quantity) quantity -= qty;
	        }
	        double totalCost() {
	            return price * quantity;
	        }
	        void display() {
	            System.out.println("Item: " + itemName + ", Qty: " + quantity + ", Total Cost: " + totalCost());
	        }
	    }

	    public static void main(String[] args) {
	        Employee e = new Employee("John", 101, 50000);
	        e.display();

	        Circle c = new Circle(7);
	        c.display();

	        Book b = new Book("Java Basics", "James", 350);
	        b.display();

	        Item it = new Item(1, "Pen", 10);
	        it.display(5);

	        MobilePhone m = new MobilePhone("Samsung", "S21", 55000);
	        m.display();

	        Student s = new Student("Alice", 1, 85);
	        s.display();

	        BankAccount acc = new BankAccount("Bob", 12345, 1000);
	        acc.deposit(500);
	        acc.withdraw(200);
	        acc.display();

	        PalindromeChecker pc = new PalindromeChecker("madam");
	        pc.display();

	        MovieTicket mt = new MovieTicket("Inception", 12, 300);
	        mt.display();

	        CartItem ci = new CartItem("Laptop", 50000, 1);
	        ci.addItem(1);
	        ci.removeItem(1);
	        ci.display();
	    }
	}
