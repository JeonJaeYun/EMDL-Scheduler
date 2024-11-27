package com.example.EMDL.Scheduler.domain.product.dto;

import com.example.EMDL.Scheduler.domain.product.entity.Product;
import com.example.EMDL.Scheduler.domain.reservation.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductInfoDto {

    private Long productId;
    private String categoryName;
    private String productName;
    private String productDetail;
    private String productImg;

    public ProductInfoDto(Product product) {
        this.productId = product.getProductId();
        this.categoryName = product.getCategory().getCategoryName();
        this.productName = product.getProductName();
        this.productDetail = product.getProductDetail();
        this.productImg = product.getProductImg();
    }
}
