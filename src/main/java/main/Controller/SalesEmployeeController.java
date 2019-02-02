package main.Controller;


import main.Controller.Repositories.SalesEmployeeRepository;
import main.Model.SalesEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class SalesEmployeeController {

    @Autowired
    SalesEmployeeRepository salesEmployeeRepository;


    @RequestMapping("/")
    public String index(){
        return "Hello Transportify";
    }

    //Gets a list of all sales employee in the sales_employee table
    @GetMapping("/sales_employees")
    public List<SalesEmployee> getAllEmployees(){
        return salesEmployeeRepository.findAll();
    }

    //Gets a specific sales employee based on employee_id
    @GetMapping("/sales_employees/{id}")
    public SalesEmployee getSalesEmployee(@PathVariable int id){
        return salesEmployeeRepository.findOne(id);
    }

    //Creates a new sales employee in the sales_employee table, payload requires firstname and lastname
    @PostMapping("/sales_employees")
    public SalesEmployee createSalesEmployee(@RequestBody Map<String, String> body){
        String firstname = body.get("firstname");
        String lastname = body.get("lastname");
        return salesEmployeeRepository.save(new SalesEmployee(firstname,lastname));
    }

    //Updates a existing sales employee based on employee_id, payload requires firstname and lastname
    @PutMapping("/sales_employees/{id}")
    public SalesEmployee updateSalesEmployee(@PathVariable int id, @RequestBody SalesEmployee body) {
        body.setEmployee_id(id);
        return salesEmployeeRepository.save(body);
    }

    //Deletes an existing sales employee based on employee_id
    @DeleteMapping("/sales_employees/{id}")
    public void deleteSalesEmployee(@PathVariable int id){
        System.out.println("employee id: " + id + " deleted");
        salesEmployeeRepository.delete(id);
    }


}
