package main.Controller;


import main.Controller.Repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import main.Model.Service;

@RestController
public class ServiceController {

    @Autowired
    ServiceRepository serviceRepository;


    //Gets a list of all services in the service table
    @GetMapping("/services")
    public List<Service> getAllServices(){
        return serviceRepository.findAll();
    }

    //Gets a specific service based on service_id
    @GetMapping("/services/{id}")
    public Service getService(@PathVariable int id){
        return serviceRepository.findOne(id);
    }

    //Creates a new service in the service table, payload requires type(service name) and description
    @PostMapping("/services")
    public Service createService(@RequestBody Service body){
        return serviceRepository.save(new Service(body.getType(),body.getDescription()));
    }

    //Updates a existing service based on service_id, payload requires type(service name) and description
    @PutMapping("/services/{id}")
    public Service updateService(@PathVariable int id, @RequestBody Service body) {
        body.setService_id(id);
        return serviceRepository.save(body);
    }

    //Deletes an existing service based on service_id
    @DeleteMapping("/services/{id}")
    public void deleteService(@PathVariable int id){
        serviceRepository.delete(id);
    }
}
