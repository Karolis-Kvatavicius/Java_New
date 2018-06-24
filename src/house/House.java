package house;

public class House {
    boolean roof;
    int walls;
    int size;

    public House(boolean roof, int walls, int size) {
        this.roof = roof;
        this.walls = walls;
        this.size = size;
    }
}

class Room {
    int windows;
    int doors;
    int beds;
    int chairs;

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getBeds() {
        return beds;
    }

    public int getChairs() {
        return chairs;
    }

    public void cleanRoom(String cleaner) {
        System.out.println("Room i being cleaned with a " + cleaner);
    }

    public Room(int windows, int doors, int beds, int chairs) {
        this.windows = windows;
        this.doors = doors;
        this.beds = beds;
        this.chairs = chairs;


    }

    public static void main(String[] args) {
        House redHouse = new House(true, 4, 120);
        Room firstRoom = new Room(2, 1, 1, 3);


    }
}