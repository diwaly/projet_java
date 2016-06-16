package fr.test.controller;

import fr.test.entities.Customer;
import fr.test.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Max on 14/06/2016.
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * Web service getCustomer
     * @param id
     * @return Customer json
     */
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {

        Customer customer = customerService.getCustomer(id);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
}
