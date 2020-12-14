package com.journaldev.spring.model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="TRANSACTION")
public class Transaction {

    @EmbeddedId
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TXN_SEQ")
    //identity does not create any sequence table  and not support in oracle
    @SequenceGenerator(name="TXN_SEQ", sequenceName="TXN_SEQ", allocationSize=100)
    @Column(name="txn_id")
    private TransactionId txnId;

    @Column(name="txn_date")
    private Date date;

    @Column(name="txn_total")
    private double total;

    @OneToOne(mappedBy="txn")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    //when we perform some action on the target entity, the same action will
    // be applicated to the associated entity
    private Customer customer;

    @Override
    public String toString(){
        return txnId+", "+total+", "+customer.getName()+", "+customer.getEmail()+", "+customer.getAddress();
    }

    //Getter-Setter methods, omitted for clarity
}

@Embeddable //used for composite key
class TransactionId {
    private long id;
    private long fo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFo() {
        return fo;
    }

    public void setFo(long fo) {
        this.fo = fo;
    }
}
