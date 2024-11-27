package com.example.EMDL.Scheduler.domain.category.repository;

import com.example.EMDL.Scheduler.domain.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
