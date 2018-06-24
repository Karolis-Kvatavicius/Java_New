package udemy_inheritance_challenge;

public class Vehicle {

    protected int speed;
    protected boolean handSteering;

    public Vehicle() {
        this(10, false);
    }



    public Vehicle(int speed, boolean handSteering) {
        this.speed = speed;
        this.handSteering = handSteering;
    }

    public Vehicle(int speed) {
        this.speed = speed;

    }

    public void increaseSpeed(int addedSpeed) {
        this.speed += addedSpeed;
        System.out.println("Speed increased. Current speed is: " + (speed + addedSpeed));
    }

    public void decreaseSpeed(int subtractedSpeed) {
        this.speed -= subtractedSpeed;
        System.out.println("Speed increased. Current speed is: " + (speed - subtractedSpeed));
    }

    public void setHandSteering(boolean steerByHands) {
        this.handSteering = steerByHands;
        System.out.println("Vehicle is steered by hands: " + steerByHands);
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isHandSteering() {
        return handSteering;
    }
}
