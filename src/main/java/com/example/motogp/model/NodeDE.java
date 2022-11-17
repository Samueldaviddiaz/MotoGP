package com.example.motogp.model;

import lombok.Data;

@Data
public class NodeDE {
    private Bike data;
    private NodeDE next;
    private NodeDE previous;

    public NodeDE(Bike data) {
        this.data = data;
    }
}