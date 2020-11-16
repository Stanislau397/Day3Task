package edu.epam.car.main;

import edu.epam.car.entity.car.*;
import edu.epam.car.report.CarReport;
import edu.epam.car.service.CarService;

public class Main {

    public static void main(String[] args) {
        Volkswagen golf = new Volkswagen("Volkswagen", "Golf", 2015, 5000, 4, "Black");
        Audi a6 = new Audi("Audi", "A6", 2018, 15000, 2, "White");
        Mazda mazda6 = new Mazda("Mazda", "6", 2008, 5000, 10, "Red");
        Honda civic = new Honda("Honda", "Civic", 2010, 8000, 14, "Blue");
        BMW m5 = new BMW("BMW", "M5", 2019, 25000, 1, "Black");
        Mercedes amgGt = new Mercedes("Mercedes", "AMG", 2018, 50000, 1, "White");
        CarService car = new CarService();
        CarReport carReport = new CarReport();

        car.addVehicle(golf);
        car.addVehicle(mazda6);
        car.addVehicle(a6);
        car.addVehicle(civic);
        car.addVehicle(m5);
        car.addVehicle(amgGt);

        carReport.printCarBrand(car, "Audi");
        carReport.printCarYearPrice(car, 2008, 3000);
        carReport.printCarModelExploitation(car, "Golf", 1);
        carReport.printCarsGivenColor(car, "Black");
    }
}
