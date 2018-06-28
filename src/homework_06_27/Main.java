package homework_06_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverseOrder;

public class Main {
    public static void main(String[] args) {

        Container<Employee> workplace = new Container<>();
        workplace.getEmployees().add( new Employee( "Petras", 45, "Direktorius" ));
        workplace.getEmployees().add( new Employee( "Nijole", 29, "Marketingo specialiste" ) );
        workplace.getEmployees().add( new Employee( "Jonas", 32, "Vadybininkas" ) );
        workplace.getEmployees().add( new Employee( "Algis", 30, "Vairuotojas" ) );

        for (Employee e: workplace.getEmployees() ) {
            System.out.println(e);
        }


//        Collections.sort(workplace.getEmployees(), (o1, o2) -> {return o1.getAge() - o2.getAge()});
//        for (Employee emp :  ) {
//            System.out.println(String.valueOf(emp.getAge()) + " " + emp.getName() + " " + emp.getOccupation() );
//        }

    }
}
