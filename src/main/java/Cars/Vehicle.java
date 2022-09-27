package Cars;

import com.sun.xml.internal.ws.api.pipe.Engine;

public abstract class Vehicle {

    private String make;
    private String model;
    private int Price;

    public Vehicle(String make, String model, int price) {
        this.make = make;
        this.model = model;
        Price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
