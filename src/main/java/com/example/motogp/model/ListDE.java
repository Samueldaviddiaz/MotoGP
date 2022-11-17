package com.example.motogp.model;

import lombok.Data;

@Data
public class ListDE {
    private NodeDE head;
    private int count;
    private int size;

    /// #0. Contar
    public int count() {
        if (head == null) {
            return 0;}
        NodeDE temp = head;
        int counter = 1;
        while (temp.getNext() != null) {
            counter += 1;
            temp = temp.getNext();}
        return counter;
    }

    /// #1. Agregar moto
    public void addBike(Bike bike) {
        if (this.head == null) {
            NodeDE newNode = new NodeDE(bike);
            this.head = newNode;
            head.getNext().setPrevious(head);
        } else {
            NodeDE temp = this.head;
            while (temp.getNext() != null) {
                temp = temp.getNext();}
            NodeDE newNode = new NodeDE(bike);
            temp.setNext(newNode);
            newNode.setPrevious(temp);}
        this.count++;
    }

    /// #2. Eliminar por descalificación
    public void deleteByData(String data) {
        if (head.getData().getNumber_bike() == data) {
            head = head.getNext();
            head.getNext().setPrevious(head);
        } else {
            NodeDE temp = head;
            while (temp != null) {
                if (temp.getNext().getData().getNumber_bike() == data) {
                    temp.setNext(temp.getNext().getNext());
                    if (temp.getNext() != null){
                        temp.getNext().setPrevious(temp);
                        break;}
                    temp = temp.getNext();}
            }
        }
    }

    /// #3. Seleccionar moto
    public int chooseBike (int n){
        if (head != null){
        count = 1;

        NodeDE temp = head;
        while (count != n){
            temp.getNext();
            count++;}
        }
        return count;
    }
}