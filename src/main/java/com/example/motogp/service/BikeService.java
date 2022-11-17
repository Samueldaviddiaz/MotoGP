package com.example.motogp.service;
import com.example.motogp.model.Bike;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BikeService {
    private List<Bike>
            bikes;

    public BikeService() {
        bikes = new ArrayList<>();
        bikes.add(new Bike("23", "Rojo", true, "Luis"));
        bikes.add(new Bike("34", "Azul", true, "Santiago"));
        bikes.add(new Bike("67", "Amarillo", false, "Cárdenas"));
        bikes.add(new Bike("98", "Verde", true, "Juan"));
        bikes.add(new Bike("01", "Rojo", true, "Pedro"));
    }

    public List<Bike> getBikes() {
        return bikes;
    }
}