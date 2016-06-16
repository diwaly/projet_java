package fr.test.controller;

import fr.test.entities.Order2;
import fr.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Max on 14/06/2016.
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * Web service getOrders
     * @return list of order json
     */
    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public ResponseEntity<List<Order2>> getOrders() {

        List<Order2> orders  = orderService.getOrders();
        return new ResponseEntity<List<Order2>>(orders, HttpStatus.OK);
    }

    /**
     * Web service getOrder
     * @param id
     * @return order json
     */
    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public ResponseEntity<Order2> getOrder(@PathVariable Long id) {

        Order2 orders  = orderService.getOrder(id);
        return new ResponseEntity<Order2>(orders, HttpStatus.OK);
    }

    /**
     * Web service setOrder
     * @param order json
     * @return order saved
     */
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ResponseEntity<Order2> setOrder(@RequestBody Order2 order) {

        Order2 orders  = orderService.setOrder(order);
        return new ResponseEntity<Order2>(orders, HttpStatus.OK);
    }

    /**
     * Webservice delOrder
     * @param id
     * @return status integer
     */
    @RequestMapping(value = "/order/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Integer> delOrder(@PathVariable Long id) {

        Integer status  = orderService.delOrder(id);
        return new ResponseEntity<Integer>(status, HttpStatus.OK);
    }
}
