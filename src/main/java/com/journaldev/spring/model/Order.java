package com.journaldev.spring.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @OneToMany
    private List<OrderItem> items = new ArrayList<OrderItem>();
    //unidirectional on to many not very common
    //The @JoinColoumn annotation tells Hibernate to use the fk_order column in the OrderItem table to join
    //the two database tables.

    //bidirectional Many to one
    //mappedBy = "Order"
    //you need to update both sides o association


}
