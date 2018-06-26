package auto_comparator;

public class Owner {
    private String ownerName;
    private String ownerSurname;

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
