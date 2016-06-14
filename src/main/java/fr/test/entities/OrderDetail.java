package fr.test.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by Max on 14/06/2016.
 */
@Entity
@Table
public class OrderDetail extends AbsEntity{

    private Float qte;
    @JsonIgnore
    @ManyToOne
    private Order2 order;
    @ManyToOne
    private Product product;

    public OrderDetail() {
    }

    public Float getQte() {
        return qte;
    }

    public void setQte(Float qte) {
        this.qte = qte;
    }

    public Order2 getOrder() {
        return order;
    }

    public void setOrder(Order2 order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
