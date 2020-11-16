package edu.epam.car.entity.vehicle;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private String model;
    private String color;
    private String registrationNumber;
    private int id;
    private int releaseYear;
    private int price;
    private int exploitation;

    public Vehicle(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Vehicle(String brand, String model, int releaseYear, int price, int exploitation, String color) {
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
        this.price = price;
        this.exploitation = exploitation;
        this.color = color;
    }

    public Vehicle(String brand, String model, int id, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.id = id;
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getExploitation() {
        return exploitation;
    }

    public void setExploitation(int exploitation) {
        this.exploitation = exploitation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return releaseYear == vehicle.releaseYear &&
                price == vehicle.price &&
                exploitation == vehicle.exploitation &&
                Objects.equals(brand, vehicle.brand) &&
                Objects.equals(model, vehicle.model) &&
                Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, releaseYear, price, exploitation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Brand: " + brand + " Model: " + model +
                "ReleaseYear: " + releaseYear + " Exploitation : " +
                exploitation + " price: " + price).toString();
    }
}
