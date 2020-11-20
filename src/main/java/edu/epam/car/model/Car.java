package edu.epam.car.model;

public class Car {
    private Brand brand;
    private Color color;
    private long carId;
    private double price;
    private int realiseYear;
    private int exploitation;
    private String model;
    private String registrationNumber;

    public Car(Brand brand, long carId, double price, int realiseYear, String model,
               Color color, String registrationNumber) {
        this.brand = brand;
        this.carId = carId;
        this.price = price;
        this.realiseYear = realiseYear;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
    }

    public Car(Brand brand, double price, int realiseYear, int exploitation, String model, Color color) {
        this.brand = brand;
        this.price = price;
        this.realiseYear = realiseYear;
        this.model = model;
        this.color = color;
        this.exploitation = exploitation;
    }

    public Car(Brand brand, double price, int exploitation, int realiseYear, String model) {
        this.brand = brand;
        this.price = price;
        this.exploitation = exploitation;
        this.realiseYear = realiseYear;
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public long getId() {
        return carId;
    }

    public void setId(int carId) {
        this.carId = carId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRealiseYear() {
        return realiseYear;
    }

    public void setRealiseYear(int realiseYear) {
        this.realiseYear = realiseYear;
    }

    public String getModel() {
        return model;
    }

    public int getExploitation() {
        return exploitation;
    }

    public void setExploitation(int exploitation) {
        this.exploitation = exploitation;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (carId != car.carId) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (realiseYear != car.realiseYear) return false;
        if (exploitation != car.exploitation) return false;
        if (brand != car.brand) return false;
        if (color != car.color) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return registrationNumber != null ? registrationNumber.equals(car.registrationNumber) : car.registrationNumber == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (int) (carId ^ (carId >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + realiseYear;
        result = 31 * result + exploitation;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (registrationNumber != null ? registrationNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Brand: " + brand).append(" Model: " + model)
                .append(" Price: " + price).append(" Realise year: " + realiseYear).toString();
    }
}
