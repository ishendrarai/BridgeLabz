import java.util.*;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account a : accounts) {
            System.out.println("Balance: " + a.getBalance());
        }
    }
}

class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer c, Account a) {
        c.addAccount(a);
        customers.add(c);
    }
}

public class BankCustomer {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Ravi");
        bank.openAccount(c1, new Account(101, 5000));
        c1.viewBalance();
    }
}
