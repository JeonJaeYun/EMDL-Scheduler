package com.example.EMDL.Scheduler.domain.category.controller;

import com.example.EMDL.Scheduler.domain.category.dto.CategoryCreateRequest;
import com.example.EMDL.Scheduler.domain.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    // 생성
    @PostMapping
    public ResponseEntity<String> createCategory(@RequestBody CategoryCreateRequest categoryCreateRequest) {
        categoryService.createCategory(categoryCreateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("카테고리 생성");
    }

    // 조회


    // 수정


    // 삭제
    @DeleteMapping("/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId) {
        categoryService.deleteCategory(categoryId);
        return ResponseEntity.status(HttpStatus.OK).body("카테고리 삭제");
    }
}
