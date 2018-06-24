package udemy_constructor;

public class Main {
    public static void main(String[] args) {

        BankAccount customer1 = new BankAccount(1234567890, 675.21, "Rasta Basta", "basta@gmail.com", "37063152575");

        System.out.println(customer1.getBalance());

        customer1.depositFunds(400);

        customer1.depositFunds(25);

        customer1.withdrawFunds(1100.21);

        customer1.withdrawFunds(0.1);

//        VipCustomer goldenMember = new VipCustomer();
//        System.out.println(goldenMember.getName() + " | " + goldenMember.getCreditLimit() + " | " + goldenMember.getEmail());
//
//        VipCustomer silverMember = new VipCustomer("Petras","petras.l@pastas.lt");
//        System.out.println(silverMember.getName() + " | " + silverMember.getCreditLimit() + " | " + silverMember.getEmail());
//
//        VipCustomer platinumMember = new VipCustomer("Juozas", "3000", "juozas@platinum.lt");
//        System.out.println(platinumMember.getName() + " | " + platinumMember.getCreditLimit() + " | " + platinumMember.getEmail());


    }
}
