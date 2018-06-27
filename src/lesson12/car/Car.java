package lesson12.car;


class Car {
    private final String registrationNumber;
    private final String make;
    private final Owner owner;

    Car(String registrationNumber, String make, Owner owner) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.owner = owner;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make= " + getMake()+
                ", registrationNumber= " + getRegistrationNumber() +
                ", owner name= " + getOwner().getFirstName() +
                ", owner surname= " + getOwner().getLastName() +
                '}';
    }

    public String showMakeFirst() {
            return "Car{" +
                    "owner surname= " + getOwner().getLastName() +
                    ", owner name= " + getOwner().getFirstName() +
                    ", registrationNumber= " + getRegistrationNumber() +
                    ", make= " + getMake() +
                    '}';
    }

}
