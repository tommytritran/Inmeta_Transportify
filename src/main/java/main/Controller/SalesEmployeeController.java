package main.Controller;


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


    @GetMapping("/sales_employees")
    public List<SalesEmployee> getAllEmployees(){
        return salesEmployeeRepository.findAll();
    }

    @GetMapping("/sales_employees/{id}")
    public SalesEmployee getSalesEmployee(@PathVariable int id){
        return salesEmployeeRepository.findOne(id);
    }

    @PostMapping("/sales_employees")
    public SalesEmployee createSalesEmployee(@RequestBody Map<String, String> body){
        String firstname = body.get("firstname");
        String lastname = body.get("lastname");
        return salesEmployeeRepository.save(new SalesEmployee(firstname,lastname));
    }


}
