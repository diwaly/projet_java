package fr.test.repository;

import fr.test.entities.Delivery;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Max on 14/06/2016.
 */
public interface DeliveryRepo extends CrudRepository<Delivery, Long> {
}
