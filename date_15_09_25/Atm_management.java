package date_15_09_25;
import java.util.*;

//creaet ineterface for transactions
interface TransactionLogger {
void logTransaction(Transaction transaction);
}

//Transaction class
class Transaction {
private String transactionId;
private Date date;
private double amount;
private String type;
//to set the data
public Transaction(String transactionId, Date date, double amount, String type) {
this.transactionId = transactionId;
this.date = date;
this.amount = amount;
this.type = type;
}
//to get the data
public String getTransactionId() {
return transactionId;
}

public Date getDate() {
return date;
}

public double getAmount() {
return amount;
}

public String getType() {
return type;
}

public String toString() {
return "Transaction ID: " + transactionId + ", Date: " + date +
", Amount: " + amount + ", Type: " + type;
}
}

//Account class
class Account {
protected String accountNumber;
protected String holderName;
protected double balance;
protected List<Transaction> transactions;

public Account(String accountNumber, String holderName, double balance) {
this.accountNumber = accountNumber;
this.holderName = holderName;
this.balance = balance;
this.transactions = new ArrayList<>();
}

public double getBalance() {
return balance;
}

public void printTransactions() {
for (Transaction t : transactions) {
System.out.println(t);
}
}
}

//SavingsAccount class
class SavingsAccount extends Account {
private static final double MIN_BALANCE = 10000;

public SavingsAccount(String accountNumber, String holderName, double balance) {
super(accountNumber, holderName, balance);
}

public boolean withdraw(double amount) {
if (balance - amount >= MIN_BALANCE) {
balance -= amount;
return true;
} else {
System.out.println(" Cannot withdraw. Maintain minimum balance of ₹500.");
return false;
}
}
}

//CurrentAccount class =>
class CurrentAccount extends Account {
public CurrentAccount(String accountNumber, String holderName, double balance) {
super(accountNumber, holderName, balance);
}

public boolean withdraw(double amount) {
if (balance >= amount) {
balance -= amount;
return true;
} else {
System.out.println(" Insufficient balance.");
return false;
}
}
}

//Abstract ATM class
abstract class ATM implements TransactionLogger {
protected String location;
protected String machineId;

public ATM(String location, String machineId) {
this.location = location;// to fix the atm postions to track the machine
this.machineId = machineId;// each machine has id
}

public abstract void withdraw(Account account, double amount);
public abstract void deposit(Account account, double amount);

public void logTransaction(Transaction transaction) {
System.out.println(" Transaction logged ,........:=> " + transaction);
}
}

//Concrete ATM implementation
class MyATM extends ATM {

public MyATM(String location, String machineId) {
super(location, machineId);
}

@Override
public void withdraw(Account account, double amount) {
boolean success = false;

if (account instanceof SavingsAccount) {
success = ((SavingsAccount) account).withdraw(amount);
} else if (account instanceof CurrentAccount) {
success = ((CurrentAccount) account).withdraw(amount);
}

if (success) {
Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Withdraw");
account.transactions.add(t);
logTransaction(t);
}
}

@Override
public void deposit(Account account, double amount) {
account.balance += amount;
Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Deposit");
account.transactions.add(t);
logTransaction(t);
}
}


public class Atm_management{
	public static void main(String[] args) {
		ATM atm = new MyATM("Delhi", "ATM001");

		//Create accounts
		SavingsAccount sa = new SavingsAccount("S001", "satyaa", 2000);
		CurrentAccount ca = new CurrentAccount("C001", "shivay", 3000);

		//Transactions
		atm.deposit(sa, 1000);
		atm.withdraw(sa, 1200);
		atm.withdraw(sa, 2500);

		atm.deposit(ca, 2000);
		atm.withdraw(ca, 4000);
		atm.withdraw(ca, 2000); // fail due to insufficient funds

		//Print transactions
		System.out.println(" Savings Account Transactions => .....:");
		sa.printTransactions();

		System.out.println(" Current Account Transactions=> ........:");
		ca.printTransactions();
		}}
