package auto_comparator;

import java.util.*;

public class AutoMain{
    public static void main(String[] args) {

        List<Auto> autoList = new ArrayList<>();

        Owner owner1 = new Owner("Pavardenis", "Vardenis");
        Owner owner2 = new Owner("Subocius", "Antanas");
        Owner owner3 = new Owner("Pavardenis", "Audrius");
        Owner owner4 = new Owner("Subocius", "Antanas");
        Owner owner5 = new Owner("Subocius","Tomas");
        Owner owner6 = new Owner("Pavardenis", "Vardenis");

        autoList.add( new Auto(owner1, "123456", "Audi" ) );//2
        autoList.add( new Auto(owner2, "123399", "Mitsubishi") );//5
        autoList.add( new Auto(owner3,"109974", "BMW"));//1
        autoList.add( new Auto(owner4, "123400", "Citroen" ));//4
        autoList.add( new Auto(owner5, "112269", "Ford"));//6
        autoList.add( new Auto(owner6,"123450", "Toyota" ) );//3

        System.out.println( autoList );

        Collections.sort( autoList, new Comparator<Auto>() {

            @Override
            public int compare(Auto a1, Auto a2) {
                String a1Temp = a1.getOwner().getOwnerSurname();
                String a2Temp = a2.getOwner().getOwnerSurname();
                int autoComparison = a1Temp.compareTo(a2Temp);

                if (autoComparison != 0) {
                    return autoComparison;
                }

                a1Temp = a1.getOwner().getOwnerName();
                a2Temp = a2.getOwner().getOwnerName();
                autoComparison = a1Temp.compareTo(a2Temp);

                if (autoComparison != 0) {
                    return autoComparison;
                }

                a1Temp = a1.getLicenceNumber();
                a2Temp = a2.getLicenceNumber();
                return a1Temp.compareTo(a2Temp);

            }
        } );

        System.out.println(autoList);

    }
}
