package com.example.graphqldemo.repository;

import com.example.graphqldemo.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
