package edu.epam.car.main;

import edu.epam.car.model.Brand;
import edu.epam.car.entity.Car;
import edu.epam.car.entity.CarsShop;
import edu.epam.car.report.CarReport;
import edu.epam.car.service.CarService;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        CarsShop carShop = new CarsShop("CarShop", 1, "321234", "asd");
        CarService carService = new CarService();
        CarReport carReport = new CarReport();

        Car audi = new Car(Brand.AUDI, 15000.0, 2, 2015, "A6");
        Car honda = new Car(Brand.HONDA, 5000.0, 4, 2010, "Civic");
        Car bmw = new Car(Brand.BMW, 20000.0, 4, 2016, "x3");
        Car mazda = new Car(Brand.MAZDA, 15000.0, 2, 2018, "6");

        carShop.addCar(audi);
        carShop.addCar(honda);
        carShop.addCar(bmw);
        carShop.addCar(mazda);

        List<Car> carsByBrand = carService.findCarByBrand(carShop, Brand.valueOf("AUDI"));
        List<Car> carsByModelExploitation = carService.findCarByModelAndExploitation(carShop, "x3", 2);
        List<Car> carsByYearAndPrice = carService.findCarByYearAndPrice(carShop, 2010, 4000.0);

        carReport.printCarsByBrand(carShop, carsByBrand, "AUDI");
        carReport.printCarsByYearAndPrice(carShop, carsByYearAndPrice, 2010, 4000.0);
        carReport.printCarsByModelAndExploitation(carShop, carsByModelExploitation, "x3", 1);



    }
}
