package udemy_constructor;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(long acountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = acountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void depositFunds(double balance) {
        System.out.println("Your balance is: " + (this.balance += balance));
        System.out.println();
    }

    public void withdrawFunds(double balance) {
        if(this.balance >= balance) {
            System.out.println("Your balance is: " + (this.balance -= balance));
            System.out.println();
        } else {
            System.out.println("Withdrawal impossible, because of insufficient funds");
            System.out.println("Your balance is: " + this.balance);
            System.out.println();
        }
    }


}
