package auto_comparator;

public class Auto extends Owner {
    private String licenceNumber;
    private String manufacturer;

    public Auto(String ownerSurname, String ownerName, String licenceNumber, String manufacturer) {
        super( ownerSurname, ownerName );
        this.licenceNumber = licenceNumber;
        this.manufacturer = manufacturer;
    }


    @Override
    public String toString() {
        return "\nOwner surname - " + getOwnerSurname() + ", " +
               "Owner name - " + getOwnerName() + ", " +
               "Licence Number - " + getLicenceNumber() + "\n";
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

}
