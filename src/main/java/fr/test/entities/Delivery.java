package fr.test.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Max on 14/06/2016.
 */
@Entity
@Table
public class Delivery extends AbsEntity{

    private String reference;
    private Date dateCreated;
    /*@ManyToMany
    private List<Order2> orders;*/
    @ManyToOne
    private Invoice invoice;

    public Delivery() {
    }

    @PrePersist
    void init() {
        this.dateCreated = new Date();
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    /*public List<Order2> getOrders() {
        return orders;
    }

    public void setOrders(List<Order2> orders) {
        this.orders = orders;
    }*/
}
