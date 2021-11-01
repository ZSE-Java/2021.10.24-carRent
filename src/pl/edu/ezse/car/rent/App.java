package pl.edu.ezse.car.rent;

import pl.edu.ezse.car.rent.database.Database;
import pl.edu.ezse.car.rent.model.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        Database database = new Database();

        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choose = reader.readLine();

        switch (choose) {
            case "1":
                for (Car car : database.getCars()) {
                    System.out.println(car);
                }
                break;
            case "2":
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Źle kliknales !!");
                break;
        }
    }
}
