package com.example.EMDL.Scheduler.domain.reservation.entity;

import com.example.EMDL.Scheduler.domain.product.entity.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    private String reservationName;

    private LocalDateTime reservationStart;

    private LocalDateTime reservationEnd;

    private String reservationDetail;

    @OneToOne
    @JoinColumn(name = "product_id", unique = true)
    private Product product;
}
