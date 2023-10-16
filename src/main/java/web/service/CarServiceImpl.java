package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList ;

    public CarServiceImpl(){
        carList = new ArrayList<>();
        carList.add(new Car("Japan", "Toyota Camry", 25000));
        carList.add(new Car("South Korea", "Hyundai Tucson", 23700));
        carList.add(new Car("USA", "Tesla Model S", 80000));
        carList.add(new Car("South Korea", "Kia Sportage", 25110));
        carList.add(new Car("USA", "Chevrolet Cruze", 18870));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, Math.min(count, carList.size()));
        }
    }
    @Override
    public List<Car> getAllCars() {
        return carList;
    }




}