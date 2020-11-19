package edu.epam.car.service;

import edu.epam.car.model.Car;
import edu.epam.car.model.CarsShop;
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

    public List<Car> findCarByModelAndExploitation(CarsShop carShop, String carModel, int carOperation) {
        List<Car> carsByModelOperationList = carShop.getCarList();

        return carsByModelOperationList.stream()
                .filter(model -> model.getModel().equals(carModel))
                .filter(exploitation -> exploitation.getExploitation() > carOperation)
                .collect(Collectors.toList());
    }

    public List<Car> findCarByYearAndPrice(CarsShop carShop, int carReleaseYear, double carPrice) {
        List<Car> carsByYearAndPriceList = carShop.getCarList();

        return carsByYearAndPriceList.stream()
                .filter(year -> year.getRealiseYear() == carReleaseYear)
                .filter(price -> price.getPrice() > carPrice)
                .collect(Collectors.toList());
    }
}
