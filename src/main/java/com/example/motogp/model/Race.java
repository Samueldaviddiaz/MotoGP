package com.example.motogp.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Race {
    private String state;
    private ListDE list_bikes;
    private Classification classification;
}