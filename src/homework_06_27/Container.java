package homework_06_27;


//ND 06.27
//
//        Parašykite parametrizuotą (generic) klasę, kuri realizuoja E tipo objektų
//        saugyklą. Taip pat padarykite kad juos galima iteruoti nurodant su lambda
//        išraiška, palyginančia du elementus, kokia tvarka bus iteruojame.
//        Pvz. jūsų klasė-konteineris vadinasi Container ir mes į jį dedame Employee
//        tipo objektus. Tada maždaug toks kodas turėtų veikti:
//        Container<Employee> box = new Container<>();
//        box.add(new Employee(…));
//        box.add(new Employee(…));
//        …
//        for (Employee emp : box.order((e1, e2) -> { … })) {
//        System.out.println(emp);
//        }

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Container<E> implements Iterable {

    private List<E> employees;

    public Container(List<E> employees) {
        this.employees = employees;
    }

    public Container<E> order(Comparator<? super E> c) {
        employees.sort(c);
        return this;
    }

    public List<E> getEmployees() {
        return employees;
    }

    @Override
    public Iterator<E> iterator() {
//        Iterator<E> employeesIterator = this.employees.iterator();
//        while (employeesIterator.hasNext()) {
          return employees.iterator();
//        }
//        return employeesIterator;
    }
}
