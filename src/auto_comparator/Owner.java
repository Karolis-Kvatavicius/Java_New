package auto_comparator;

public class Owner {
    private String ownerSurname;
    private String ownerName;


    public Owner(String ownerName, String ownerSurname) {
        this.ownerName = ownerSurname;
        this.ownerSurname = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }
}
