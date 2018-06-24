package car_udemy_polymorphism;

public class Car {

    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Car's engine is started.");
    }

    public void accelerate() {
        System.out.println("Car's speed increased.");
    }

    public void stop() {
        System.out.println("Car has now stopped.");
    }
}

class Audi extends Car {


    public Audi(int cylinders, String name) {
        super( cylinders, name );
    }

    @Override
    public void startEngine() {
        System.out.println("Audi's engine is started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi's speed increased.");
    }

    @Override
    public void stop() {
        System.out.println("Audi has now stopped.");
    }
}

class Citroen extends Car {


    public Citroen(int cylinders, String name) {
        super( cylinders, name );
    }

    @Override
    public void startEngine() {
        System.out.println("Citroen's engine is started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Citroen's speed increased.");
    }

    @Override
    public void stop() {
        System.out.println("Citroen has now stopped.");
    }
}

class GenericCar extends Car {

    public GenericCar(int cylinders, String name) {
        super( cylinders, name );
    }


}