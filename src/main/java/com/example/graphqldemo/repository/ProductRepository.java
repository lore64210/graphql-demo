package com.example.graphqldemo.repository;

import com.example.graphqldemo.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
