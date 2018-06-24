package udemy_inheritance_challenge;

public class Audi extends Car {

    private boolean allWheelsDrive;

    public Audi(int speed, boolean handSteering, int gear, boolean allWheelsDrive) {
        super( speed, handSteering, gear );
        this.allWheelsDrive = allWheelsDrive;
    }

    public Audi(boolean allWheelsDrive) {
        this.allWheelsDrive = allWheelsDrive;
    }

    public void setAllWheelsDrive(boolean allWheelsDrive) {
        this.allWheelsDrive = allWheelsDrive;
        System.out.println("All wheels drive is installed: " + true);
    }


}
