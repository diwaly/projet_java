package fr.test.repository;

import fr.test.entities.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Max on 14/06/2016.
 */
public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
