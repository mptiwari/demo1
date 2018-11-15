/*
package com.example.controller;

import com.example.model.Car;
import com.example.repository.CarRepository;
import com.example.service.CarService;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CoolCarController {

    private CarRepository repository;

    public CoolCarController(CarRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/cool-cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Car> coolCars() {
        return repository.findAll().stream()
                .filter(this::isCool)
                .collect(Collectors.toList());
    }

    private boolean isCool(Car car) {
        return !car.getName().equals("AMC Gremlin") &&
                !car.getName().equals("Triumph Stag") &&
                !car.getName().equals("Ford Pinto") &&
                !car.getName().equals("Yugo GV");
    }



}*/
