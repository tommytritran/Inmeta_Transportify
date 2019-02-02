package main.Controller.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.Model.*;


//Interface to handle storage, retrieval and search behavior for sales employee object from DB

@Repository
public interface SalesEmployeeRepository extends JpaRepository<SalesEmployee, Integer> {

}
