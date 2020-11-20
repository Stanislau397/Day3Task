package edu.epam.car.report;

import edu.epam.car.model.Car;
import edu.epam.car.model.CarShop;

import java.util.List;

public class CarReport {

    public void printCarsByBrand(CarShop carsShop, List<Car> carsByBrand) {
        System.out.println("List of cars of chosen brand:");
        carsByBrand.forEach(System.out::println);
    }

    public void printCarsByModelAndExploitation(CarShop carsShop, List<Car> carsByModelExploitation) {
        System.out.println("List of cars of chosen model and exploitation " +
                "more than chosen");
        carsByModelExploitation.forEach(System.out::println);
    }

    public void printCarsByYearAndPrice(CarShop carsShop, List<Car> carsByYearPrice) {
        System.out.println("List of cars of chosen year the price of which higher than chosen:");
        carsByYearPrice.forEach(System.out::println);
    }
}
