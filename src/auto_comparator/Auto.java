package auto_comparator;

public class Auto {
    private String licenceNumber;
    private String manufacturer;
    private Owner owner;

    public Auto(Owner owner, String licenceNumber, String manufacturer) {

        this.owner = owner;
        this.licenceNumber = licenceNumber;
        this.manufacturer = manufacturer;
    }


    @Override
    public String toString() {
        return "\nOwner surname - " + getOwner().getOwnerSurname() + ", " +
               "Owner name - " + getOwner().getOwnerName() + ", " +
               "Licence Number - " + getLicenceNumber() + "\n";
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public Owner getOwner() {
        return owner;
    }
}
