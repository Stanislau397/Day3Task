package edu.epam.car.report;

import edu.epam.car.entity.Car;
import edu.epam.car.entity.CarsShop;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.List;

public class CarReport {

    private static final Logger logger = Logger.getLogger(CarReport.class.getName());

    public void printCarsByBrand(CarsShop shop, List<Car> carsByBrand, String brand) {
        logger.log(Level.INFO, "List of cars of " + brand);
        carsByBrand.forEach(logger::info);
    }

    public void printCarsByModelAndExploitation(CarsShop shop, List<Car> carsByModelExploitation, String model, int exploitation) {
        logger.log(Level.INFO, "List of cars " + model + " in exploitation more than " +
                exploitation + " years");
        carsByModelExploitation.forEach(logger::info);
    }

    public void printCarsByYearAndPrice(CarsShop carShop, List<Car> carsByYearPrice, int year, double price) {
        logger.log(Level.INFO, "List of cars of " + year + " year " +
                " the price of which higher than " + price + "$");
        carsByYearPrice.forEach(logger::info);
    }
}
