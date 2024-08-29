package appSoft.project.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import appSoft.project.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
