package main.Controller.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import main.Model.Service;
import org.springframework.stereotype.Repository;


//Interface to handle storage, retrieval and search behavior for service(type of service) object from DB
@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
