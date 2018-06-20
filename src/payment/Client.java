package payment;

public class Client implements Payment {

    private int bankAcountNumber;
    private String ownersName;
    private double amountTransferred;

    public Client(int bankAcountNumber, String ownersName, double amountTransferred){

        this.bankAcountNumber = bankAcountNumber;
        this.ownersName = ownersName;
        this.amountTransferred = amountTransferred;
    }

    public void printClientInfo() {
        System.out.println("Client: ");
        System.out.println("Bank account number: " + bankAcountNumber);
        System.out.println("Account owners name: " + ownersName);
        System.out.println("Transaction amount: " + amountTransferred + "\n");
    }

    @Override
    public int bankAcount() {
        return bankAcountNumber;
    }

    @Override
    public String acountOwner() {
        return ownersName;
    }

    @Override
    public double amount() {
        return amountTransferred;
    }
}
