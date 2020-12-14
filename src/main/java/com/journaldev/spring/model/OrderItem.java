package com.journaldev.spring.model;

import javax.persistence.ManyToOne;

public class OrderItem {

    @ManyToOne
    private Order order;
    //by default hibernate would generate the foreign key order_id
    //or use the @JoinColumn(name = "fk_order")
    //unidirectional many to one
}
