package com.example.EMDL.Scheduler.domain.category.service;

import com.example.EMDL.Scheduler.domain.category.dto.CategoryCreateRequest;
import com.example.EMDL.Scheduler.domain.category.entity.Category;
import com.example.EMDL.Scheduler.domain.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    // 생성
    public void createCategory(CategoryCreateRequest categoryCreateRequest) {

        Category newCategory = new Category();
        newCategory.setCategoryName(categoryCreateRequest.getCategoryName());
        newCategory.setCategoryDetail(categoryCreateRequest.getCategoryDetail());

        categoryRepository.save(newCategory);
    }

    // 조회


    // 수정


    // 삭제
    public void deleteCategory(Long categoryId) {

        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 카테고리입니다."));

        categoryRepository.delete(category);
    }
}
