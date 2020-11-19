package edu.epam.car.service;

import edu.epam.car.model.Car;
import edu.epam.car.model.CarsShop;
import edu.epam.car.model.Brand;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CarServiceTest {

    CarsShop carsShop;
    CarService carService;

    @BeforeTest
    public void setUp() {
        this.carService = new CarService();
        this.carsShop = new CarsShop("CarShop", 1, "33333", "some");
    }

    @Test
    public void testFindCarByBrand() {
        Car honda = new Car(Brand.HONDA, 5000.0, 4, 2010, "Civic");
        Car mazda = new Car(Brand.MAZDA, 3000.0, 5, 2011, "6");
        carsShop.addCar(honda);

        List<Car> expResult = new ArrayList<>();
        expResult.add(mazda);

        List<Car> result = carService.findCarByBrand(carsShop, Brand.valueOf("HONDA"));

        assertEquals(result, expResult);
    }

    @Test
    public void testFindCarByModelAndExploitation() {
        Car honda = new Car(Brand.HONDA, 5000.0, 4, 2010, "Civic");
        Car mazda = new Car(Brand.MAZDA, 3000.0, 5, 2011, "6");
        carsShop.addCar(honda);

        List<Car> expResult = new ArrayList<>();
        expResult.add(honda);

        List<Car> result = carService.findCarByModelAndExploitation(carsShop, "Civic", 1);

        assertEquals(result, expResult);
    }

    @Test
    public void testFindCarByYearAndPrice() {
        Car honda = new Car(Brand.HONDA, 5000.0, 4, 2010, "Civic");
        Car mazda = new Car(Brand.MAZDA, 3000.0, 5, 2011, "6");
        carsShop.addCar(honda);

        List<Car> result = carService.findCarByYearAndPrice(carsShop, 2010, 1000.0);

        List<Car> expResult = new ArrayList<>();
        expResult.add(honda);

        assertEquals(result, expResult);
    }

    @AfterTest
    public void tierDown() {
        this.carService = null;
        this.carsShop = null;
    }

}