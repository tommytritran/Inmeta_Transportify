package main.Controller;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.Model.*;

import java.util.List;


@Repository
public interface SalesEmployeeRepository extends JpaRepository<SalesEmployee, Integer> {

    //Returns all the employees
    List<SalesEmployee> findAll();

    //Returns one specific employee based on ID


}
