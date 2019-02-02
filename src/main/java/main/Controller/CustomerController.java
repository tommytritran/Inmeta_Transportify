package main.Controller;


import main.Controller.Repositories.CustomerRepository;
import main.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    //Gets a list of all  customers in the customer table
    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    //Gets a specific customer based on customer_id
    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerRepository.findOne(id);
    }

    //Creates a new customer in the customer table, payload requires first name, last name, phone number and email
    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer body){
        return customerRepository.save(new Customer(body.getFirstName(),body.getLasttName(), body.getPhoneNumber(), body.getEmail()));
    }

    //Updates a existing customer based on customer_id, payload requires first name, last name, phone number and email
    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer body) {
        body.setCustomer_id(id);
        return customerRepository.save(body);
    }

    //Deletes an existing customer based on customer_id
    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerRepository.delete(id);
    }


}
