package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(List<Car> carsList, int count) {
        carsList.stream().limit(count).collect(Collectors.toList());
        return carsList;
    }

    public List<Car> carsList = new ArrayList<>();

    {
        carsList.add(new Car("BMV", 11, "red"));
        carsList.add(new Car("AUDI", 8, "blue"));
        carsList.add(new Car("LADA", 4, "grey"));
        carsList.add(new Car("OKA", 15, "orange"));
        carsList.add(new Car("VAZ", 2, "green"));
    }

}

