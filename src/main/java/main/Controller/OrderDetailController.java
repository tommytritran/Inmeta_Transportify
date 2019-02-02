package main.Controller;


import main.Controller.Repositories.CustomerRepository;
import main.Controller.Repositories.OrderDetailRepository;
import main.Controller.Repositories.SalesEmployeeRepository;
import main.Model.Customer;
import main.Model.OrderDetail;
import main.Model.SalesEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailController {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Autowired
    SalesEmployeeRepository salesEmployeeRepository;

    @Autowired
    CustomerRepository customerRepository;


    //Gets a list of all orders in the order table
    @GetMapping("/orders")
    public List<OrderDetail> getAllOrders(){
        return orderDetailRepository.findAll();
    }

    //Gets a specific order based on order_id
    @GetMapping("/orders/{id}")
    public OrderDetail getOrder(@PathVariable int id){
        return orderDetailRepository.findOne(id);
    }

    //Creates a new order in the service table, payload requires employee_id, customer_id, service_id, receiver_name,
    //                                                           address_from, address_to,
    //                                                           date and comment
    @PostMapping("/orders/{employee_id}/{customer_id}")
    public OrderDetail createService(@PathVariable int employee_id, @PathVariable int customer_id, @RequestBody OrderDetail body){
        //TODO - replace fobaaar with system date
        String date = "fobaaar";
        SalesEmployee se = salesEmployeeRepository.findOne(employee_id);
        Customer cu = customerRepository.findOne(customer_id);
        body.setSalesEmployee(se);
        body.setCustomer(cu);
        body.setDate(date);

        return orderDetailRepository.save(body);
    }

    //Updates a existing order based on order_id, payload requires employee_id, customer_id, service_id, receiver_name,
    //                                                             address_from, zip_from, city_from, address_to, zip_to
    //                                                             city_to, date and comment
    @PutMapping("/orders/{employee_id}/{order_id}")
    public OrderDetail updateService(@PathVariable int employee_id, int order_id, @RequestBody OrderDetail body) {
        return orderDetailRepository.save(body);
    }

    //Deletes an existing order based on order_id
    @DeleteMapping("/orders/{id}")
    public void deleteService(@PathVariable int id){
        orderDetailRepository.delete(id);
    }

}
