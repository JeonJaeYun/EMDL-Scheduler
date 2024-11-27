package com.example.EMDL.Scheduler.domain.product.entity;

import com.example.EMDL.Scheduler.domain.category.entity.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;

    private String productDetail;

    private String productImg;

    private int count;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
}
