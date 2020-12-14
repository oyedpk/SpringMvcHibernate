package com.journaldev.spring.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {

    @ManyToMany(mappedBy="products")
    private Set<Store> stores = new HashSet<Store>();

    //for bidirectional many to many relation

}
