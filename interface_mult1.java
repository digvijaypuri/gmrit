//Write a Java program to demonstrate the implementation of multiple interfaces. Create two interfaces Bank and ATM containing abstract methods. Implement both interfaces in a class Customer and display banking operations.
public class interface_mult1 {
    interface Bank {
    void openAccount();
    void closeAccount();
    }
interface ATM {
    void withdrawMoney();
    void checkBalance();
}
class Customer implements Bank, ATM {
    @Override
    public void openAccount() {
        System.out.println("Account opened successfully.");
    }
    @Override
    public void closeAccount() {
        System.out.println("Account closed successfully.");
    }
    @Override
    public void withdrawMoney() {
        System.out.println("Money withdrawn successfully.");
    }
    @Override
    public void checkBalance() {
        System.out.println("Your balance is $1000.");
    }
}
    public void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.openAccount();
        customer1.checkBalance();
        customer1.withdrawMoney();
        customer1.closeAccount();
    }
}