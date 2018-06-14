package driving;

import driving.family.*;

public class drivingMain {
    public static void main(String[] args) {
        FamilyMember[] family1 = new FamilyMember[4];
        family1[0] = new Father("Stasys", 22);
        family1[1] = new Mother("Adele", 21);
        family1[2] = new Son("Jonukas", 4);
        family1[3] = new Daughter("Grytute", 21);

        FamilyMember[] family2 = new FamilyMember[3];
        family2[0] = new Father("Zigmas", 30);
        family2[1] = new Mother("Ona", 27);
        family2[2] = new Son("Paulius", 7);

        System.out.println(family1.length);
        System.out.println(family2.length);
    }
}
