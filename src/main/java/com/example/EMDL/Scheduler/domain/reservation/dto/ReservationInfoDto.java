package com.example.EMDL.Scheduler.domain.reservation.dto;

import com.example.EMDL.Scheduler.domain.product.entity.Product;
import com.example.EMDL.Scheduler.domain.reservation.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ReservationInfoDto {

    private Long reservationId;
    private String reservationName;
    private Product product;
    private LocalDateTime reservationStart;
    private LocalDateTime reservationEnd;
    private String reservationDetail;

    public ReservationInfoDto(Reservation reservation) {
        this.reservationId = reservation.getReservationId();
        this.reservationName = reservation.getReservationName();
        this.product = reservation.getProduct();
        this.reservationStart = reservation.getReservationStart();
        this.reservationEnd = reservation.getReservationEnd();
        this.reservationDetail = reservation.getReservationDetail();
    }
}
