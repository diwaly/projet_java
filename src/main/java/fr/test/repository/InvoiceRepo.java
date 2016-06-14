package fr.test.repository;

import fr.test.entities.Invoice;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Max on 14/06/2016.
 */
public interface InvoiceRepo extends CrudRepository<Invoice, Long> {
}
