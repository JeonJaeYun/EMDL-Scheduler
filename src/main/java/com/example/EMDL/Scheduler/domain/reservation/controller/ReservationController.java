package com.example.EMDL.Scheduler.domain.reservation.controller;

import com.example.EMDL.Scheduler.domain.product.dto.ProductCreateRequest;
import com.example.EMDL.Scheduler.domain.reservation.dto.ReservationCreateRequest;
import com.example.EMDL.Scheduler.domain.reservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    // 생성
    @PostMapping
    public ResponseEntity<String> createReservation(@RequestBody ReservationCreateRequest reservationCreateRequest) {
        reservationService.createReservation(reservationCreateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("예약 완료");
    }

    // 조회


    // 수정


    // 삭제
    @DeleteMapping("/{reservationId}")
    public ResponseEntity<String> deleteReservation(@PathVariable Long reservationId) {
        reservationService.deleteReservation(reservationId);
        return ResponseEntity.status(HttpStatus.OK).body("예약 취소");
    }
}
