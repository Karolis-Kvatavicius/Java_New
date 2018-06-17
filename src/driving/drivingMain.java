//Sukurti interfeisa Driver
//
//        interfeise Driver turi buti metodai, kurie grazins boolean reiksmes
//        canDriveACar()
//        canRideABike()
//
//
//        sukurti abstrakcia klase FamilyMember, kurioje butu laukai: name, age
//        sie laukai turetu buti final ir nustatomi tik is konstruktoriaus
//
//        sukurti klases, kurios paveldi FamilyMember
//        Driver turi buti implementuotas visom klasem isskyrus Dog
//
//        Father (gali vairuoti visas transporto priemones),
//        Mother(gali vairuoti visas transporto priemones),
//        Son (gali vairuoti dvirati, o automobili, jei turi 18 metu),
//        Daughter (gali vairuoti tik dvirati)
//
//        ---------------------------------------------------------------
//
//        Sukurti garage pakete interfeisa Vehicle
//        Vehicle turi tureti metoda void drive(FamilMember member)
//
//        Taip pat turi buti Car ir Bike klases kurios ji implementina
//        ---------------------------------------------------------------
//        sukurti klase su main motodu driving pakete
//        metode turime sukurti 2 seimas
//        viena susideda is tevo, mamos, sunaus ir dukros
//        kitoje auga tik vienas vaikas (nesvarbu koks)
//        ---------------------------------------------------------------
//        ND 06.14
//
//        Atspausdinti statistika
//        1. kiek seimos nariu kiekvienoje seimoje
//        2. kiek vairuotoju seimoje
//        3. kiek gali vairuoti visas priemones
//        4. koks seimos narys yra vyriausias
//        5. koks yra amziaus vidurkis seimoje
//
//        Visi skaiciavimai turi buti aprasyti atskiroje klaseje FamilyStats
//        Si klase turi turetit konstruktoriu su parametru paduoti seimai
//        ir visa statistika spausdinama per tos klases metodus, pvz.:
//        stats = new FamiStats(family1)
//        stats.countFamilyMembers(); ir t.t.

package driving;

import driving.family.*;

public class drivingMain {
    public static void main(String[] args) {
        FamilyMember[] family1 = new FamilyMember[4];
        family1[0] = new Father("Stasys", 22);
        family1[1] = new Mother("Adele", 23);
        family1[2] = new Son("Jonukas", 5);
        family1[3] = new Daughter("Grytute", 8);

        FamilyMember[] family2 = new FamilyMember[3];
        family2[0] = new Father("Zigmas", 30);
        family2[1] = new Mother("Ona", 27);
        family2[2] = new Son("Paulius", 7);

        FamilyStats stats = new FamilyStats(family1);
        stats.membersCount();
        stats.driversCount();
        stats.canDriveAllCount();
        stats.oldest();
        stats.ageMean();

        FamilyStats stats2 = new FamilyStats(family2);
        stats.membersCount();
        stats.driversCount();
        stats.canDriveAllCount();
        stats.oldest();
        stats.ageMean();
    }
}