package edu.epam.car.entity.car;

import edu.epam.car.entity.vehicle.Vehicle;

public class Mercedes extends Vehicle {

    public Mercedes(String brand, String model, String color, int price) {
        super(brand, model, color, price);
    }

    public Mercedes(String brand, String model, int releaseYear, int price, int exploitation, String color) {
        super(brand, model, releaseYear, price, exploitation, color);
    }

    public Mercedes(String brand, String model, int id, String registrationNumber) {
        super(brand, model, id, registrationNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Brand: " + getBrand() + " Model: " + getModel() +
                " ReleaseYear: " + getReleaseYear() + " Exploitation : " +
                getExploitation() + " price: " + getPrice()).toString();
    }
}
