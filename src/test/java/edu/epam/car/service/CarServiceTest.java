package edu.epam.car.service;

import edu.epam.car.model.Car;
import edu.epam.car.model.CarShop;
import edu.epam.car.model.Brand;
import edu.epam.car.model.Color;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CarServiceTest {

    CarService carService;

    @BeforeTest
    public void setUp() {
        this.carService = new CarService();
    }

    @Test
    public void testFindCarByBrand() {
        CarShop carsShop = new CarShop("CarShop", 2, "3444545", "someAddress");
        Car honda = new Car(Brand.HONDA, 5000.0, 4, 2010, "Civic", Color.WHITE);
        carsShop.addCar(honda);

        List<Car> expResult = new ArrayList<>();
        expResult.add(honda);

        List<Car> result = carService.findCarByBrand(carsShop, Brand.valueOf("HONDA"));

        assertEquals(result, expResult);
    }

    @Test
    public void testFindCarByModelAndExploitation() {
        CarShop carsShop = new CarShop("CarShop", 2, "3444545", "someAddress");
        Car honda = new Car(Brand.HONDA, 5000.0, 4, 2010, "Civic", Color.BLUE);
        carsShop.addCar(honda);

        List<Car> expResult = new ArrayList<>();
        expResult.add(honda);

        List<Car> result = carService.findCarByModelAndExploitation(carsShop, "Civic", 1);

        assertEquals(result, expResult);
    }

    @Test
    public void testFindCarByYearAndPrice() {
        CarShop carsShop = new CarShop("CarShop", 2, "3444545", "someAddress");
        Car honda = new Car(Brand.HONDA, 5000.0, 2010, 4, "Civic", Color.BLACK);
        carsShop.addCar(honda);

        List<Car> result = carService.findCarByYearAndPrice(carsShop, 2010, 4000.0);

        List<Car> expResult = new ArrayList<>();
        expResult.add(honda);

        assertEquals(result, expResult);
    }

    @AfterTest
    public void tierDown() {
        this.carService = null;
    }
}