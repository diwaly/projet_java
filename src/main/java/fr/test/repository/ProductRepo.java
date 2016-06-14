package fr.test.repository;

import fr.test.entities.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Max on 14/06/2016.
 */
public interface ProductRepo extends CrudRepository<Product, Long>{
}
