package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Car1", "Color1"));
        carList.add(new Car(2, "Car2", "Color2"));
        carList.add(new Car(3, "Car3", "Color3"));
        carList.add(new Car(4, "Car4", "Color4"));
        carList.add(new Car(5, "Car5", "Color5"));
        return carList;
    }

    public List<Car> numCars(int num) {
        List<Car> temp = new CarServiceImpl().getCars();
        if(num < 5) {
            List<Car> cars = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                cars.add(temp.get(i));
            }
            return cars;
        }
        return temp;
    }
}
