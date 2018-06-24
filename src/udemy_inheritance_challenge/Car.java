package udemy_inheritance_challenge;

public class Car extends Vehicle {

    protected int gear;

    public void shiftGearsUp(int gear) {
        System.out.println("Gear shifted. Current gear is " + (this.gear + gear));
    }

    public void shiftGearsDown(int gear) {
        System.out.println("Gear shifted. Current gear is " + (this.gear - gear));
    }

    @Override
    public void increaseSpeed(int addedSpeed) {
        super.speed += addedSpeed;
        super.increaseSpeed( addedSpeed );
    }

    @Override
    public void decreaseSpeed(int subtractedSpeed) {
        super.speed -= subtractedSpeed;
        super.decreaseSpeed( subtractedSpeed );
    }

    @Override
    public void setHandSteering(boolean steerByHands) {
        super.handSteering = steerByHands;
        super.setHandSteering( true );
    }

    public Car(int gear) {
        this.gear = gear;
    }

    public Car() {
        super(50, true);
    }

    public Car(int speed, boolean handSteering, int gear) {
        super( speed, handSteering );
        this.gear = gear;
    }
}
