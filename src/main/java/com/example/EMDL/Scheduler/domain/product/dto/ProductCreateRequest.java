package com.example.EMDL.Scheduler.domain.product.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductCreateRequest {

    @NotBlank(message = "카테고리 ID는 필수입니다.")
    private Long categoryId;

    @NotBlank(message = "제품 이름은 필수입니다.")
    private String productName;

    private String productDetail;

    private String productImg;

    @NotBlank(message = "제품 수량은 필수입니다.")
    private int count;
}
