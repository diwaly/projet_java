package fr.test.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * Created by Max on 14/06/2016.
 */
@Entity
@Table
public class Invoice extends AbsEntity{

    private String reference;
    private Date dateCreated;
    private Float tva;
    @JsonIgnore
    @OneToMany(mappedBy="invoice")
    private List<Delivery> deliveries;

    public Invoice() {
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

    public Float getTva() {
        return tva;
    }

    public void setTva(Float tva) {
        this.tva = tva;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }
}
