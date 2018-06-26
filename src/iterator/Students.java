package iterator;

public class Students {

    private final String name;
    private final int attendance;

    public Students(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public int getAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return
                "name= " + name +
                ", attendance= " + attendance + ";";
    }


}
