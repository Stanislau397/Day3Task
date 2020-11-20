package edu.epam.car.model;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String shopName;
    private long carShopId;
    private String phoneNumber;
    private String address;
    private List<Car> carList;

    public CarShop(String shopName, long carShopId, String phoneNumber, String address) {
        this.shopName = shopName;
        this.carShopId = carShopId;
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

    public long getCarShopId() {
        return carShopId;
    }

    public void setCarShopId(long carShopId) {
        this.carShopId = carShopId;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarShop)) return false;

        CarShop carsShop = (CarShop) o;

        if (carShopId != carsShop.carShopId) return false;
        if (shopName != null ? !shopName.equals(carsShop.shopName) : carsShop.shopName != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(carsShop.phoneNumber) : carsShop.phoneNumber != null)
            return false;
        if (address != null ? !address.equals(carsShop.address) : carsShop.address != null) return false;
        return carList != null ? carList.equals(carsShop.carList) : carsShop.carList == null;
    }

    @Override
    public int hashCode() {
        int result = shopName != null ? shopName.hashCode() : 0;
        result = 31 * result + (int) (carShopId ^ (carShopId >>> 32));
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (carList != null ? carList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("ShopName: " + shopName).append(" Address + " + address)
                .append(" Phone number: " + phoneNumber).toString();
    }
}
