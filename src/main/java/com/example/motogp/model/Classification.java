package com.example.motogp.model;

import com.example.motogp.model.dto.BikeClasiDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Classification {
    private String description;
    private List<BikeClasiDTO> grill;
    private boolean state;
}