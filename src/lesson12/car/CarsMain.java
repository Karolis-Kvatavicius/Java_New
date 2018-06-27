package lesson12.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Sukurkite automobilių klasę su laukais: numeris, marke, savininkas (vardas, pavarde).
 * Išveskite automobilius sulygiuotus pagal savininko pavardę, vardą ir automobilio numerį.
 */

class CarsMain {
    public static void main(String[] args) {
        final Owner owner1 = new Owner("Ma", "Si");
        final Owner owner2 = new Owner("Da", "P");
        final Owner owner3 = new Owner("Ro", "Si");
        final Owner owner4 = new Owner("Do", "P");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("UVM821", "Audi", owner1));
        cars.add(new Car("DCG320", "Audi", owner1));
        cars.add(new Car("FEN873", "Opel", owner1));
        cars.add(new Car("FDE201", "Audi", owner1));

        cars.add(new Car("MVC821", "Audi", owner2));
        cars.add(new Car("GEK821", "Volkswagen", owner2));
        cars.add(new Car("HNH320", "Toyota", owner2));

        cars.add(new Car("FDE201", "Audi", owner3));
        cars.add(new Car("HBN111", "Audi", owner3));
        cars.add(new Car("KJO874", "Opel", owner3));

        cars.add(new Car("KHH064", "Toyota", owner4));

        //System.out.println("\nBefore:");
        // spausdinimui naudojam foreach
        for (Car car : cars) {
            //System.out.println(car);
        }

        // kvieciame metoda, kuriame apraseme rikiavimo logika
        sortCarsByOwner(cars);

        System.out.println("\nAfter:");
        Iterator<Car> carIterator = cars.iterator();

        while (carIterator.hasNext()) {
            System.out.println(carIterator.next().showMakeFirst());
        }

        sortCarsByCarParams(cars);

        System.out.println("\nHomework sorting:");
        carIterator = cars.iterator();

        while (carIterator.hasNext()) {
            System.out.println(carIterator.next());
        }
    }

    private static void sortCarsByOwner(List<Car> cars) {
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                Owner owner1 = car1.getOwner();
                Owner owner2 = car2.getOwner();

                int status = owner1.getLastName().compareTo(owner2.getLastName());
                // jeigu pavardes nesutampa, toliau nebetikrinam
                if (status != 0) {
                    return status;
                }
                status = owner1.getFirstName().compareTo(owner2.getFirstName());
                // jeigu vardai nesutampa, toliau nebetikrinam
                if (status != 0) {
                    return status;
                }
                // lyginam valstybinius numerius
                return car1.getRegistrationNumber().compareTo(car2.getRegistrationNumber());
            }
        });
    }

    private static void sortCarsByCarParams(List<Car> cars) {
        // rikiuojam pagal pavardę, vardą ir automobilio numerį
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                Owner owner1 = car1.getOwner();
                Owner owner2 = car2.getOwner();

                int status = car1.getMake().compareTo(car2.getMake());
                // jeigu marke nesutampa, toliau nebetikrinam
                if (status != 0) {
                    return status;
                }
                status = car1.getRegistrationNumber().compareTo(car2.getRegistrationNumber());
                // jeigu reg numeris nesutampa, toliau nebetikrinam
                if (status != 0) {
                    return status;
                }
                // lyginam savininku vardus
                return owner1.getFirstName().compareTo(owner2.getFirstName());
            }
        });
    }
}
