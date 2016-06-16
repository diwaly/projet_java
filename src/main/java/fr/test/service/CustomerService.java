package fr.test.service;

import fr.test.entities.Customer;
import fr.test.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Max on 14/06/2016.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    /**
     * getCustomer
     * @param id Customer
     * @return Customer
     */
    public Customer getCustomer(Long id) {
        return customerRepo.findOne(id);
    }
}
