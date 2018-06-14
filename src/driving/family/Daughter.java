package driving.family;

public class Daughter extends FamilyMember implements Driver {
    public Daughter(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveCar() {
        return false;
    }

    @Override
    public boolean canRideBike() {
        return true;
    }
}
