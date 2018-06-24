package udemy_inheritance_challenge;

public class Main {
    public static void main(String[] args) {

        Vehicle cart = new Vehicle();
        System.out.println(cart.getSpeed() + " " + cart.isHandSteering());
        cart.setHandSteering( true );
        System.out.println(cart.isHandSteering());
        cart.increaseSpeed( 50 );
        System.out.println();

        Audi a6 = new Audi(true);
        System.out.println(a6.speed);
        System.out.println(a6.handSteering);
        System.out.println(a6.gear);
        System.out.println();

        Car genericCar = new Car( 6);
        System.out.println(genericCar.speed);
        System.out.println(genericCar.handSteering);
        System.out.println(genericCar.gear);
    }
}
