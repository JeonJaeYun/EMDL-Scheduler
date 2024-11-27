package com.example.EMDL.Scheduler.domain.category.dto;

import com.example.EMDL.Scheduler.domain.category.entity.Category;
import com.example.EMDL.Scheduler.domain.product.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CategoryInfoDto {

    private Long categoryId;
    private String categoryName;
    private String categoryDetail;

    public CategoryInfoDto(Category category) {
        this.categoryId = category.getCategoryId();
        this.categoryName = category.getCategoryName();
        this.categoryDetail = category.getCategoryDetail();
    }
}
