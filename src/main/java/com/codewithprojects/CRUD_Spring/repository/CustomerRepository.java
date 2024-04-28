package com.codewithprojects.CRUD_Spring.repository;

import com.codewithprojects.CRUD_Spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
