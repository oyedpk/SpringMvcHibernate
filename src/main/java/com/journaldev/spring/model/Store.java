package com.journaldev.spring.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Store {

    @ManyToMany
    private Set<Product> products = new HashSet<Product>();

    //expects an association table with name of both enties and the primary key attributes of both
    //@JoinTable(name = “store_product”,
    //           joinColumns = { @JoinColumn(name = “fk_store”) },
    //           inverseJoinColumns = { @JoinColumn(name = “fk_product”) })

}
