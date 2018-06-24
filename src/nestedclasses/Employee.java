package nestedclasses;

import java.util.*;

import static java.lang.String.format;

public class Employee {

    String name;
    Employee.Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    static class Address {
        String city,
               address;

        public Address(String city, String address) {
            this.city = city;
            this.address = address;
        }
    }


        public static void main(String[] args) {
            Employee employee1 = new Employee("Paulius", new Employee.Address("Vilnius", "Gedimino pr."));
            Employee employee2 = new Employee("Lina", new Employee.Address("Kaunas", "Saules"));
            Employee employee3 = new Employee("Giedre", new Employee.Address("Panevezys", "Plento"));
            Employee employee4 = new Employee("Arunas", new Employee.Address("Siauliai", "Uosto"));
            Employee employee5 = new Employee("Benediktas", new Employee.Address("Vilnius", "Stoties"));

            List<Employee> employees = new ArrayList<>();
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);
            employees.add(employee4);
            employees.add(employee5);

            //Spausdina
            countCities(employees);
            countCitiesAndNames(employees);
        }

    private static void countCities(List<Employee> employees) {
        Set<String> uniqueCities = new HashSet<>();
        for (Employee e : employees) {
            uniqueCities.add(e.address.city);
        }
        System.out.println(format("Unique cities employees live in: %d", uniqueCities.size()));
    }

    private static void countCitiesAndNames(List<Employee> employees) {

        Map<String, List<Employee>> employeeByCity = new HashMap<>();

        for (Employee e : employees) {
            String city = e.address.city;

            if(employeeByCity.containsKey(city)) {
                employeeByCity.get(city).add(e);
            } else {
                List<Employee> list = new ArrayList<>();
            }

        }

        for(Map.Entry<String, List<Employee>> e : employeeByCity.entrySet()) {
            System.out.println(format("%s - %d", e.getKey(), e.getValue().size()));
        }
    }
}
