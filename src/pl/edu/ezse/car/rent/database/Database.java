package pl.edu.ezse.car.rent.database;

import pl.edu.ezse.car.rent.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Car> cars = new ArrayList<>();

    public Database() {
        this.cars.add(new Car("Toyota", "Corolla", 2010, "TK1"));
        this.cars.add(new Car("Mazda", "3", 2010, "TK2"));
        this.cars.add(new Car("BMW", "5", 2010, "TK3"));
        this.cars.add(new Car("Kia", "Ceed", 2010, "TK4"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
