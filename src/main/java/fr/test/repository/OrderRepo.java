package fr.test.repository;

import fr.test.entities.Order2;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Max on 14/06/2016.
 */
public interface OrderRepo extends CrudRepository<Order2, Long>{

    @Override
    List<Order2> findAll();
}
