package homework_06_27;

import java.util.*;

import static java.util.Collections.reverseOrder;
import static java.util.Objects.compare;

public class Main {
    public static void main(String[] args) {

        Container<Employee> workplace = new Container<>(new ArrayList<>());
        List<Employee> employeeList = workplace.getEmployees();

        employeeList.add( new Employee( "Petras", 45, "Direktorius" ));
        employeeList.add( new Employee( "Nijole", 29, "Marketingo specialiste" ) );
        employeeList.add( new Employee( "Jonas", 32, "Vadybininkas" ) );
        employeeList.add( new Employee( "Algis", 30, "Vairuotojas" ) );

        for (Employee emp: employeeList) {
            System.out.println(String.valueOf(emp.getAge()) + " " + emp.getName() + " - " + emp.getOccupation());
        }
        System.out.println();

        Collections.sort(employeeList, (e1, e2) -> e1.getAge() - e2.getAge() );

        for (Employee emp: employeeList) {
            System.out.println(String.valueOf(emp.getAge()) + " " + emp.getName() + " - " + emp.getOccupation());
        }
        System.out.println();

        Collections.sort(employeeList, (e1, e2) -> e2.getOccupation().compareTo(e1.getOccupation()));

        for (Employee emp: employeeList) {
            System.out.println(String.valueOf(emp.getAge()) + " " + emp.getName() + " - " + emp.getOccupation());
        }

//        for (Employee emp : workplace.order((e1, e2) -> e2.getAge() - e1.getAge()) ) {
//            System.out.println(emp);
//        }

    }
}
