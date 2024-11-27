package com.example.EMDL.Scheduler.domain.product.repository;

import com.example.EMDL.Scheduler.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
