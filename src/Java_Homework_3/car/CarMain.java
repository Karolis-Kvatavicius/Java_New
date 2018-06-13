package Java_Homework_3.car;

    public class CarMain {
        public static void main(String[] args) {
            Car[] cars = new Car[5];
            for (int i = 0; i < cars.length; i++) {
                int j = i + 1;
//                cars[i] = new Car("name" + j, (i % 2 == 0) ? "manual" : "automatic", j * 50);

            }

            for (Car c : cars) {
                System.out.println(c.getName() + "-" + c.staticName + " " + c.getGearBox() + "|" + c.getGearBox());
            }

            cars[2].staticName = "static?";
            cars[2].setName("non-static");
            System.out.println();

            for (Car c : cars) {
                System.out.println(c.getName() + "-" + c.staticName + " " + c.getGearBox() + "|" + c.getMaxSpeed());
            }
        }
    }

   abstract class Car {
        final static int MIN_SPEED = 0;
        final static String MANUAL = "manual";
        final static String AUTOMATIC = "automatic";
        final static String DIESEL = "diesel";
        final static String PETROL = "petrol";
        static String staticName = "static";

        private String name;
        private String gearBox;
        private int maxSpeed;
        private String make;
        private String model;


        public Car(String name, String gearBox, int maxSpeed) {
            this.name = name;
            this.gearBox = gearBox;
            this.maxSpeed = maxSpeed;
        }

        public Car(String gearBox) {
            this.gearBox = gearBox;
        }

        public Car(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public Car() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGearBox() {
            return gearBox;
        }

        public void setGearBox(String gearBox) {// manual arba automatic | equals
            if (gearBox.equals(MANUAL) || gearBox.equals(AUTOMATIC)) {
                this.gearBox = gearBox;
            }
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            if (maxSpeed > MIN_SPEED) {
                this.maxSpeed = maxSpeed;
            }
        }

       public abstract String getFuelType(String fuelType);
   }
