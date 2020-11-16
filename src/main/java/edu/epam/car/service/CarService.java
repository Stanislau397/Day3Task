package edu.epam.car.service;

import edu.epam.car.entity.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private List<Vehicle> vehicleList;

    public CarService() {
        this.vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }


    //To find list of cars of given brand
    public List<Vehicle> findBrand(String brand) {
        List<Vehicle> brandList = new ArrayList<>();

        for (Vehicle car : vehicleList) {
            if (car.getBrand().equals(brand)) {
                brandList.add(car);
            }
        }
        return brandList;
    }

    //To find list of cars of given model and operation more than given
    public List<Vehicle> findModelExploitation(String model, int operation) {
        List<Vehicle> exploitationList = new ArrayList<>();

        for (Vehicle car : vehicleList) {
            if (car.getModel().equals(model) && car.getExploitation() > operation) {
                exploitationList.add(car);
            }
        }
        return exploitationList;
    }

    //To find list of cars of given year and price more than given
    public List<Vehicle> findYearPrice(int release, int price) {
        List<Vehicle> carsYearPriceList = new ArrayList<>();

        for (Vehicle car : vehicleList) {
            if (car.getReleaseYear() == release && car.getPrice() > price) {
                carsYearPriceList.add(car);
            }
        }
        return carsYearPriceList;
    }

    //To find list of cars of given color
    public List<Vehicle> findColor(String color) {
        List<Vehicle> colorList = new ArrayList<>();

        for (Vehicle car : vehicleList) {
            if (car.getColor().equals(color)) {
                colorList.add(car);
            }
        }
        return colorList;
    }
}
