package main.Controller.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.Model.Customer;


//Interface to handle storage, retrieval and search behavior for customer object from DB
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
