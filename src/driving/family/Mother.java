package driving.family;


public class Mother  extends FamilyMember implements Driver {
    public Mother(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveCar() {
        return true;
    }

    @Override
    public boolean canRideBike() {
        return true;
    }
}
