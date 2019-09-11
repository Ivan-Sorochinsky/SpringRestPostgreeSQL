package net.sorochinsky.springrestpostrgeesql.service;
import net.sorochinsky.springrestpostrgeesql.model.Customer;
import java.util.List;

public interface CustomerService {

    Customer getById(Integer id);

    void save(Customer customer);

    void delete(Integer id);

    List<Customer> getAll();
}
