package edu.epam.car.report;

import edu.epam.car.entity.vehicle.Vehicle;
import edu.epam.car.service.CarService;

import java.util.List;

public class CarReport {

    public void printCarBrand(CarService cars, String brand) {
        List<Vehicle> brandList = cars.findBrand(brand);
        System.out.println("List of cars of " + brand + " brand:");

        for (Vehicle car : brandList) {
            System.out.println(car.toString());
        }
    }

    public void printCarModelExploitation(CarService cars, String model, int year) {
        List<Vehicle> exploitationList = cars.findModelExploitation(model, year);
        System.out.println("\nList of cars of " + model + " model " +
                " that have been in operation more than " + year + " years");

        for (Vehicle car : exploitationList) {
            System.out.println(car.toString());
        }
    }

    public void printCarYearPrice(CarService cars, int release, int price) {
        List<Vehicle> yearPriceList = cars.findYearPrice(release, price);
        System.out.println("\nList of cars of year + " + release + " release " +
                " the price of which is higher than " + price + "$");

        for (Vehicle car : yearPriceList) {
            System.out.println(car.toString());
        }
    }

    public void printCarsGivenColor(CarService cars, String color) {
        List<Vehicle> colorList = cars.findColor(color);
        System.out.println("\nList of cars of " + color + " color:");

        for (Vehicle car : colorList) {
            System.out.println(car.toString());
        }
    }
}
