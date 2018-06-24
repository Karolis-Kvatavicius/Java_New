package driving.family;

public class FamilyStats {
    private static FamilyMember[] stats;

    public FamilyStats (FamilyMember[] stats) {
        this.stats = stats;
    }


    public void membersCount() {
        System.out.println("Members: " + stats.length);
    }

    public void driversCount() {
        int a = 0;
        for(int i = 0; i < stats.length; i++) {

            if(stats[i].canDriveCar() == true) {
               a++;
            }
        }
        System.out.println("Can drive car_udemy_polymorphism: " + a);
    }

    public void canDriveAllCount() {
        int a = 0;
        for(int i = 0; i < stats.length; i++) {

            if(stats[i].canDriveCar() == true && stats[i].canRideBike() == true) {
                a++;
            }
        }
        System.out.println("Can drive car_udemy_polymorphism and bike: " + a);
    }

    public void oldest() {
        int a = 0;
        String b = " ";

        for(int i = 0; i < stats.length; i++) {

            if(stats[i].getAge() > a) {
                b = stats[i].getName();
                a = stats[i].getAge();
            }
        }
        System.out.println("Oldest in family: " + b + " " + a);
    }

    public void ageMean() {

        double a = 0;

        for(int i = 0; i < stats.length; i++) {

            a += stats[i].getAge();
        }
        double b = a / stats.length;
        System.out.println("Family Age Mean: " + b + "\n");
    }

}
