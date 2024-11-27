package com.example.EMDL.Scheduler.domain.reservation.service;

import com.example.EMDL.Scheduler.domain.category.entity.Category;
import com.example.EMDL.Scheduler.domain.product.dto.ProductCreateRequest;
import com.example.EMDL.Scheduler.domain.product.entity.Product;
import com.example.EMDL.Scheduler.domain.product.repository.ProductRepository;
import com.example.EMDL.Scheduler.domain.reservation.dto.ReservationCreateRequest;
import com.example.EMDL.Scheduler.domain.reservation.entity.Reservation;
import com.example.EMDL.Scheduler.domain.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final ProductRepository productRepository;

    // 생성
    public void createReservation(ReservationCreateRequest reservationCreateRequest) {

        Long productId = reservationCreateRequest.getProductId();
        Product product =  productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 제품입니다."));

        Reservation newReservation = new Reservation();
        newReservation.setProduct(product);
        newReservation.setReservationName(reservationCreateRequest.getReservationName());
        newReservation.setReservationDetail(reservationCreateRequest.getReservationDetail());
        newReservation.setReservationStart(reservationCreateRequest.getReservationStart());
        newReservation.setReservationEnd(reservationCreateRequest.getReservationEnd());

        reservationRepository.save(newReservation);
    }

    // 조회


    // 수정


    // 삭제
    public void deleteReservation(Long reservationId) {

        Reservation reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 예약입니다."));

        reservationRepository.delete(reservation);
    }
}
