package com.example.motogp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Bike {
    private String number_bike;
    private String color;
    private boolean state;
    private String pilot;
}