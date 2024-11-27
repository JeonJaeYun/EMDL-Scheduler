package com.example.EMDL.Scheduler.domain.product.service;

import com.example.EMDL.Scheduler.domain.category.dto.CategoryCreateRequest;
import com.example.EMDL.Scheduler.domain.category.entity.Category;
import com.example.EMDL.Scheduler.domain.category.repository.CategoryRepository;
import com.example.EMDL.Scheduler.domain.product.dto.ProductCreateRequest;
import com.example.EMDL.Scheduler.domain.product.entity.Product;
import com.example.EMDL.Scheduler.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    // 생성
    public void createProduct(ProductCreateRequest productCreateRequest) {

        Long categoryId = productCreateRequest.getCategoryId();
        Category category =  categoryRepository.findById(categoryId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 카테고리입니다."));

        Product newProduct = new Product();
        newProduct.setProductName(productCreateRequest.getProductName());
        newProduct.setProductName(category.getCategoryName());
        newProduct.setProductDetail(productCreateRequest.getProductDetail());
        newProduct.setProductImg(productCreateRequest.getProductImg());
        newProduct.setCount(productCreateRequest.getCount());

        productRepository.save(newProduct);
    }

    // 조회


    // 수정


    // 삭제
    public void deleteProduct(Long productId) {

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 제품입니다."));

        productRepository.delete(product);
    }
}
