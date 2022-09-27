package Customers;

import Cars.Car;

import java.util.ArrayList;

public class Customer extends Person{

    private int money;
    private ArrayList<Car> cars;

    public Customer(String name, int age, int money, ArrayList<Car> cars) {
        super(name, age);
        this.money = money;
        this.cars = cars;
    }
}
