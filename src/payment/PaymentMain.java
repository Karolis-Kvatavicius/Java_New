package payment;

public class PaymentMain {

    public static void main(String[] args) {

            Employee[] employee = new Employee[3];
            employee[0] = new Employee(14, "John", 1200);
            employee[1] = new Employee(100, "Patricia", 800);
            employee[2] = new Employee(157, "Pablo", 2100);

            Client[] client = new Client[5];
            client[0] = new Client(14, "Pjotr", 1150);
            client[1] = new Client(100, "Samantha", 1500);
            client[2] = new Client(180, "Ricky", 750);
            client[3] = new Client(199, "Jane", 3000);
            client[4] = new Client(7, "Paul", 500);

            for (int i = 0; i < employee.length; i++) {
                employee[i].printEmployeeInfo();
            }

            for (int i = 0; i < client.length; i++) {
                client[i].printClientInfo();
            }
    }
}
