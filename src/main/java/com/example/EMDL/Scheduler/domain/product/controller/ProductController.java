package com.example.EMDL.Scheduler.domain.product.controller;

import com.example.EMDL.Scheduler.domain.category.dto.CategoryCreateRequest;
import com.example.EMDL.Scheduler.domain.product.dto.ProductCreateRequest;
import com.example.EMDL.Scheduler.domain.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // 생성
    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductCreateRequest productCreateRequest) {
        productService.createProduct(productCreateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("제품 등록");
    }

    // 조회


    // 수정


    // 삭제
    @DeleteMapping("/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.status(HttpStatus.OK).body("제품 삭제");
    }
}
