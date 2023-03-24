package edu.iu.c322.customerservice.controller;

import edu.iu.c322.customerservice.model.Customer;
import edu.iu.c322.customerservice.repository.CustomerRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

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
        return repository.create(customer);
    }

    public void update(@RequestBody Customer customer, @PathVariable int id){
        repository.update(customer, id);
    }

    public void delete(@PathVariable int id){
        repository.delete(id);
    }

    private CustomerRepository repository;


}
