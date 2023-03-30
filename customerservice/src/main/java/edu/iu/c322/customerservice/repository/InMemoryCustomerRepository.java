package edu.iu.c322.customerservice.repository;

import edu.iu.c322.customerservice.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;



public class InMemoryCustomerRepository {
    int x;
    private List <Customer> customers = new ArrayList<>();


    public List<Customer> findAll(){
        return customers;
    }


    public int create(@RequestBody Customer customer){
        int id = customers.size() + 1;
        customer.setId(1);
        customers.add(customer);
        return id;
    }

    // PUT localhose:8080/customers



    public void update(Customer customer, int id){
       // Customer x = getCustomerById(id);
        //if (x != null){
          //  x.setName(customer.getName());
            //x.setEmail(customer.getEmail());
        //} else {
          //  throw new IllegalStateException("customer id is not valid");
        //}
    }



    public void delete(int id){
        //Customer x = getCustomerById(id);
        //if(x != null){
         //   customers.remove(x);
        //} else{
          //  throw new IllegalStateException("invalid customer, cannot delete");
       // }
    }
}
