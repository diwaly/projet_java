package fr.test.service;

import fr.test.entities.Order2;
import fr.test.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Max on 14/06/2016.
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public List<Order2> getOrders() {
        return orderRepo.findAll();
    }

    public Order2 getOrder(Long id) {
        return orderRepo.findOne(id);
    }

    public Order2 setOrder(Order2 order) {
        return orderRepo.save(order);
    }

    public Integer delOrder(Long id) {
        orderRepo.delete(id);
        return 0;
    }
}
