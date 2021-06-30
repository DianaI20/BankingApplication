package myPackage;
// store the necessary information for a bank account

public class BankAccount {
    private String userName;
    private String customerId;
    private int previousTransaction;
    private double balance;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getPreviousTransaction() {
        return previousTransaction;
    }
    
    public double getBalance() {
        return balance;
    }




}
