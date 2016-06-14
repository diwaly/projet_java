package fr.test.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Max on 14/06/2016.
 */
@Entity
@Table
public class Order2 extends AbsEntity{

    private String reference;
    private Date dateCreated;
    @JsonIgnore
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy="order")
    private List<OrderDetail> orderDetails;

    @ManyToMany
    @JoinTable(name="order_delivery", joinColumns = {
            @JoinColumn(name="order_id")},
            inverseJoinColumns = { @JoinColumn(name = "delivery_id")})
    private List<Delivery> deliveries;

    public Order2() { // bug name with Order on mysql
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

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
