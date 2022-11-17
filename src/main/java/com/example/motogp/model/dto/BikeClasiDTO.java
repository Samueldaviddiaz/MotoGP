package com.example.motogp.model.dto;

import com.example.motogp.model.Bike;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BikeClasiDTO {
    private Bike bike;
    private float time;
}
