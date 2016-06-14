package fr.test.repository;

import fr.test.entities.OrderDetail;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Max on 14/06/2016.
 */
public interface OrderDetailRepo extends CrudRepository<OrderDetail, Long>{
}
