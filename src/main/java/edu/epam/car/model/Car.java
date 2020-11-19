package edu.epam.car.model;

public class Car {
    private Brand brand;
    private int id;
    private double price;
    private int realiseYear;
    private int exploitation;
    private String model;
    private String color;
    private String registrationNumber;

    public Car(Brand brand, int id, double price, int realiseYear, String model,
               String color, String registrationNumber) {
        this.brand = brand;
        this.id = id;
        this.price = price;
        this.realiseYear = realiseYear;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
    }

    public Car(Brand brand, double price, int realiseYear, int exploitation, String model, String color) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        if (null == brand) {
            return (brand.equals(car.brand));
        } else {
            if (!brand.equals(car.brand)) {
                return false;
            }
            if (id != car.id || price != car.price
                    || realiseYear != car.realiseYear
                    || exploitation != car.exploitation) {
                return false;
            }
            if (null == model) {
                return (model.equals(car.model));
            } else {
                if (!model.equals(car.model)) {
                    return false;
                }
                if (null == color) {
                    return (color.equals(car.color));
                } else {
                    if (!color.equals(car.color)) {
                        return false;
                    }
                    if (null == registrationNumber) {
                        return (registrationNumber.equals(car.registrationNumber));
                    } else {
                        if (!registrationNumber.equals(car.registrationNumber)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        return (int) (hash * price * id * exploitation +
                ((null == registrationNumber) ? 0 : registrationNumber.hashCode()) +
                ((null == brand) ? 0 : brand.hashCode()) +
                ((null == model) ? 0 : model.hashCode()) +
                ((null == color) ? 0 : color.hashCode()));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Brand: " + brand).append(" Model: " + model)
                .append(" Price: " + price).append(" Realise year: " + realiseYear).toString();
    }
}
