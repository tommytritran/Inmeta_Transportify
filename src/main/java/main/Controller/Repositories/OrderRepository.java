package main.Controller.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.Model.Order;

//Interface to handle storage, retrieval and search behavior for order object from DB

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
