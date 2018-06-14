package driving.family;

public class Son extends FamilyMember implements Driver {
    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveCar() {
        return getAge() >= 18 ? true : false;
    }

    @Override
    public boolean canRideBike() {
        return true;
    }
}
