package auto_comparator;

import java.util.*;

public class AutoMain{
    public static void main(String[] args) {

        List<Auto> autoList = new ArrayList<>();
        autoList.add( new Auto("Pavardenis", "Vardenis", "123456", "Audi" ) );//2
        autoList.add( new Auto( "Subocius", "Antanas", "123455", "Mitsubishi") );//5
        autoList.add( new Auto("Pavardenis", "Audrius", "109974", "BMW"));//1
        autoList.add( new Auto("Subocius", "Antanas", "123400", "Citroen" ));//4
        autoList.add( new Auto( "Subocius","Tomas", "112269", "Ford"));//6
        autoList.add( new Auto("Pavardenis", "Vardenis", "123460", "Toyota" ) );//3

        System.out.println( autoList );

        Collections.sort( autoList, new Comparator<Auto>() {

            @Override
            public int compare(Auto a1, Auto a2) {
                String a1Temp = a1.getOwnerSurname();
                String a2Temp = a2.getOwnerSurname();
                int autoComparison = a1Temp.compareTo(a2Temp);

                if (autoComparison != 0) {
                    return autoComparison;
                }

                a1Temp = a1.getOwnerName();
                a2Temp = a2.getOwnerName();
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
