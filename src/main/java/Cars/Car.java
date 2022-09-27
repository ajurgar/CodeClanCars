package Cars;

import Components.CarType;
import Components.Tyres;
import com.sun.xml.internal.ws.api.pipe.Engine;

public class Car extends Vehicle{

    private Engine engine;
    private CarType carType;
    private Tyres tyres;
    private String color;

    public Car(String make, String model, int price, Engine engine, CarType carType, Tyres tyres, String color) {
        super(make, model, price);
        this.engine = engine;
        this.carType = carType;
        this.tyres = tyres;
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
