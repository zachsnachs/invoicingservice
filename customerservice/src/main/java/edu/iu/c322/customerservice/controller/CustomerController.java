package edu.iu.c322.customerservice.controller;

import edu.iu.c322.customerservice.model.Customer;
import edu.iu.c322.customerservice.repository.CustomerRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    // Get localhost:8080/customers
    @GetMapping
    public List<Customer> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public int create(@Valid @RequestBody Customer customer){

        Customer newCustomer = repository.save(customer);

        return newCustomer.getId();
    }

    public void update(@RequestBody Customer customer, @PathVariable int id)
    {
        customer.setId(id);
        repository.save(customer);
    }

    public void delete(@PathVariable int id)
    {
        Customer customer = new Customer();
        customer.setId(id);
        repository.delete(customer);
    }

    private CustomerRepository repository;


}
