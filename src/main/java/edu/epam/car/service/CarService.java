package edu.epam.car.service;

import edu.epam.car.entity.Car;
import edu.epam.car.entity.CarsShop;
import edu.epam.car.model.Brand;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public List<Car> findCarByBrand(CarsShop carShop, Brand carBrand) {
        List<Car> carsByBrandList = carShop.getCarList();

        return carsByBrandList.stream()
                .filter(brand -> brand.getBrand().equals(carBrand))
                .collect(Collectors.toList());
    }

    public List<Car> findCarByModelAndExploitation(CarsShop carShop, String carModel, int carExploitation) {
        List<Car> carsByModelOperationList = carShop.getCarList();

        return carsByModelOperationList.stream()
                .filter(model -> model.getModel().equals(carModel))
                .filter(exploitation -> exploitation.getExploitation() > carExploitation)
                .collect(Collectors.toList());
    }

    public List<Car> findCarByYearAndPrice(CarsShop carShop, int year, double price) {
        List<Car> carsByYearAndPriceList = carShop.getCarList();

        return carsByYearAndPriceList.stream().filter(result -> result.getRealiseYear() == year
                && result.getPrice() > price).collect(Collectors.toList());
    }
}
