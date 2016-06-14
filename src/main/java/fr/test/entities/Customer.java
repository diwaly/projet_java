package fr.test.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Max on 14/06/2016.
 */
@Entity
@Table
public class Customer extends AbsEntity{

    private String firstname;
    private String lastname;
    private String adress;
    private String postal;
    private String city;
    @OneToMany(mappedBy="customer")
    private List<Order2> orders;

    public Customer() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Order2> getOrders() {
        return orders;
    }

    public void setOrders(List<Order2> orders) {
        this.orders = orders;
    }
}
