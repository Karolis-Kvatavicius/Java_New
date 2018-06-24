package car_udemy_polymorphism;

public class Main {
    public static void main(String[] args) {
        Audi a6 = new Audi(8, "a6");
        a6.startEngine();

        GenericCar car = new GenericCar(4, "car");
        car.startEngine();
    }
}
