package edu.epam.car.model;

import java.util.ArrayList;
import java.util.List;

public class CarsShop {

    private String shopName;
    private int id;
    private String phoneNumber;
    private String address;
    private List<Car> carList;

    public CarsShop(String shopName, int id, String phoneNumber, String address) {
        this.shopName = shopName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("ShopName: " + shopName).append(" Address + " + address)
                .append(" Phone number: " + phoneNumber).toString();
    }
}
