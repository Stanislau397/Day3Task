package edu.epam.service;

import edu.epam.car.entity.vehicle.Vehicle;
import edu.epam.car.service.CarService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CarServiceTest {

    @Test
    public void testFindBrand() {
        Vehicle vehicle = new Vehicle("Audi", "A6", 2018, 15000, 2, "White");
        CarService carService = new CarService();
        carService.addVehicle(vehicle);

        List<Vehicle> result = carService.findBrand("Audi");
        List<Vehicle> expResult = new ArrayList<>();
        expResult.add(vehicle);

        Assert.assertEquals(result, expResult);
    }

    @Test
    public void testFindModelExploitation() {
        Vehicle vehicle = new Vehicle("Audi", "A6", 2018, 15000, 2, "White");
        CarService carService = new CarService();
        carService.addVehicle(vehicle);

        List<Vehicle> result = carService.findModelExploitation("A6", 1);
        List<Vehicle> expResult = new ArrayList<>();
        expResult.add(vehicle);

        Assert.assertEquals(result, expResult);

    }

    @Test
    public void testFindYearPrice() {
        Vehicle vehicle = new Vehicle("Audi", "A6", 2018, 15000, 2, "White");
        CarService carService = new CarService();
        carService.addVehicle(vehicle);

        List<Vehicle> result = carService.findYearPrice(2018, 10000);
        List<Vehicle> expResult = new ArrayList<>();
        expResult.add(vehicle);

        Assert.assertEquals(result, expResult);
    }

    @Test
    public void testFindColor() {
        Vehicle vehicle = new Vehicle("Audi", "A6", 2018, 15000, 2, "White");
        CarService carService = new CarService();
        carService.addVehicle(vehicle);

        List<Vehicle> result = carService.findColor("White");
        List<Vehicle> expResult = new ArrayList<>();
        expResult.add(vehicle);

        Assert.assertEquals(result, expResult);
    }
}