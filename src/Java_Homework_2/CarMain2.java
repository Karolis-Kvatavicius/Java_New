package Java_Homework_2;

public class CarMain2 {
    public static void main (String[] args) {

        Car car1 = new Car();
        car1.name = "Toyota";
        car1.gearbox = "manual";
        car1.maxspeed = 180;

        Car car2 = new Car();
        car2.name = "Lada";
        car2.gearbox = "manual";
        car2.maxspeed = 330;

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
        car5.gearbox = "automatic";
        car5.maxspeed = 250;

        // rasti auto, kurios greitis didziausias ir atspausdint tą greitį kartu su auto pavadinimu

        if(car1.maxspeed > car2.maxspeed && car1.maxspeed > car3.maxspeed && car1.maxspeed > car4.maxspeed &&
                car1.maxspeed > car5.maxspeed) {
            car1.setmaxspeed();
        }
        else if(car2.maxspeed > car1.maxspeed && car2.maxspeed > car3.maxspeed && car2.maxspeed > car4.maxspeed &&
                car2.maxspeed > car5.maxspeed) {
            car2.setmaxspeed();
        }
        else if(car3.maxspeed > car1.maxspeed && car3.maxspeed > car2.maxspeed && car3.maxspeed > car4.maxspeed &&
                car3.maxspeed > car5.maxspeed) {
            car3.setmaxspeed();
        }
        else if(car4.maxspeed > car1.maxspeed && car4.maxspeed > car2.maxspeed && car4.maxspeed > car3.maxspeed &&
                car4.maxspeed > car5.getmaxspeed()) {
            car4.setmaxspeed();
        }
        else if(car5.maxspeed > car1.maxspeed && car5.maxspeed > car2.maxspeed && car5.maxspeed > car3.maxspeed &&
                car5.maxspeed > car4.maxspeed) {
            car5.setmaxspeed();
        }


        // suskaiciuojami auto su mechanine pavaru deze ir atspausdinamas ju kiekis
        int manualCount = 0;
        if(car1.gearbox.equals("manual")) {
            manualCount++;
        }
        if(car2.gearbox.equals("manual")) {
            manualCount++;
        }
        if(car3.gearbox.equals("manual")) {
            manualCount++;
        }
        if(car4.gearbox.equals("manual")) {
            manualCount++;
        }
        if(car5.gearbox.equals("manual")) {
            manualCount++;
        }
        System.out.println("\nCars with manual transmission: " + manualCount);


        // suskaiciuojami auto su automatine pavaru deze ir atspausdinamas ju kiekis
        int autoCount = 0;
        if(car1.gearbox.equals("automatic")) {
            autoCount++;
        }
        if(car2.gearbox.equals("automatic")) {
            autoCount++;
        }
        if(car3.gearbox.equals("automatic")) {
            autoCount++;
        }
        if(car4.gearbox.equals("automatic")) {
            autoCount++;
        }

        if(car5.getgearbox().equals("automatic")) {
            autoCount++;
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
