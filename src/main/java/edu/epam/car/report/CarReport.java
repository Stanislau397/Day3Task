package edu.epam.car.report;

import edu.epam.car.model.Car;
import edu.epam.car.model.CarsShop;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.List;

public class CarReport {

    private static final Logger logger = Logger.getLogger(CarReport.class.getName());

    public void printCarsByBrand(CarsShop carsShop, List<Car> carsByBrand) {
        logger.log(Level.INFO, "List of cars of chosen brand:");
        carsByBrand.forEach(logger::info);
    }

    public void printCarsByModelAndExploitation(CarsShop carsShop, List<Car> carsByModelExploitation) {
        logger.log(Level.INFO, "List of cars of chosen model and exploitation more:" +
                "than chosen");
        carsByModelExploitation.forEach(logger::info);
    }

    public void printCarsByYearAndPrice(CarsShop carsShop, List<Car> carsByYearPrice) {
        logger.log(Level.INFO, "List of cars of chosen year the price of which higher than chosen:");
        carsByYearPrice.forEach(logger::info);
    }
}
