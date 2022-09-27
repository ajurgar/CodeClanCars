package Dealership;

import Cars.Car;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> carsOnSale;
    private int till;

    public Dealership(ArrayList<Car> carsOnSale, int till) {
        this.carsOnSale = carsOnSale;
        this.till = till;
    }


    public ArrayList<Car> getCarsOnSale() {
        return carsOnSale;
    }

    public void setCarsOnSale(ArrayList<Car> carsOnSale) {
        this.carsOnSale = carsOnSale;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }
}
