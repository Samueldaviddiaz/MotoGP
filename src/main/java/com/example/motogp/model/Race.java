package com.example.motogp.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.sql.Select;
import com.example.motogp.service.BikeService;

@Data
@AllArgsConstructor
public class Race {
    private String state;
    private ListDE list_bikes;
    private Classification classification;

    public void Forward(Select select, int position)
    {
        if(list_bikes.getHead() != null)
        {
            NodeDE temp= list_bikes.getHead();
            while (temp != select) {
                temp= temp.getNext();}
            if(position == list_bikes.chooseBike(){
                temp.setNext(temp.getNext());
                temp.setNext(temp.getPrevious());}
        }
    }

    public void Lost() {
        NodeDE temp = list_bikes.getHead();
        while (temp != select) {
            temp = temp.getNext();}
        if (position == listBikes) {
            temp.setNext(temp.getNext());
            temp.setNext(temp.getPrevious());}
    }
}
