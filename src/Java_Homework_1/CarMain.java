package Java_Homework_1;// konstantos apsibreziamos su final kad reiksme nesikeistu, ir SNAKE_CASE
//

public class CarMain {
    public static void main (String[] args) {

//        float a = 5.3f;
        
        Car car1 = new Car();
        car1.name = "Toyota";
        car1.gearbox = "manual";
        car1.maxspeed = 250;

        Car car2 = new Car();
        car2.name = "Lada";
        car2.gearbox = "manual";
        car2.maxspeed = 310;

        Car car3 = new Car();
        car3.name = "BMW";
        car3.gearbox = "automatic";
        car3.maxspeed = 200;

        Car car4 = new Car();
        car4.name = "Volkswagen";
        car4.gearbox = "manual";
        car4.maxspeed = 195;

        Car car5 = new Car();
        car5.name = "Porsche";
        car5.gearbox = "manual";
        car5.maxspeed = 400;

        Car car6 = new Car();
        car6.name = "Formula";
        car6.gearbox = "automatic";
        car6.maxspeed = 415;

        Car[] cars = new Car[6];
        cars[0] = car1; // 250
        cars[1] = car2; // 310
        cars[2] = car3; // 200
        cars[3] = car4; // 195
        cars[4] = car5; // 400
        cars[5] = car6; // 415


        // rasti auto, kurios greitis didziausias ir atspausdint tą greitį kartu su auto pavadinimu
        int largest = 0;
        for (int i = 1; i < cars.length; i++) {

            if (cars[largest].getmaxspeed() < cars[i].getmaxspeed()) {
                largest = i;
            }
        }
        cars[largest].setmaxspeed();


        // suskaiciuojami auto su mechanine pavaru deze ir atspausdinamas ju kiekis
        int manualCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i].gearbox.equals("manual")) {
                manualCount++;

            }
        }

        System.out.println("\nCars with manual transmission: " + manualCount);


        // suskaiciuojami auto su automatine pavaru deze ir atspausdinamas ju kiekis
        int autoCount = 0;
        for(int i = 0; i < cars.length; i++) {

            if(cars[i].gearbox.equals("automatic")) {
                autoCount++;
            }
        }

        System.out.println("\nCars with automatic transmission: " + autoCount);
    }
}

class Car {

    String name;
    String gearbox;
    int maxspeed;

    // Metodai:
    public String getgearbox() {
        return gearbox;
    }

    public int getmaxspeed() {
        return maxspeed;
    }

    public void setgearbox() {
        System.out.println(gearbox);
    }

    public void setmaxspeed() {
        System.out.println("\n" + name + " " + maxspeed);
    }

    // Konstruktoriai:
    public Car(String gearbox, int maxspeed) {
        this.gearbox = gearbox;
        this.maxspeed = maxspeed;
    }

    public Car(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Car(String gearbox) {
        this.gearbox = gearbox;
    }

    public Car() {

    }
}
