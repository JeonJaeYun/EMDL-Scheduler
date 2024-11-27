package com.example.EMDL.Scheduler.domain.reservation.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ReservationCreateRequest {

    @NotBlank(message = "예약자 이름은 필수입니다.")
    private String reservationName;

    @NotBlank(message = "제품 ID는 필수입니다.")
    private Long productId;

    @NotBlank(message = "예약 시작일은 필수입니다.")
    private LocalDateTime reservationStart;

    @NotBlank(message = "예약 종료일은 필수입니다.")
    private LocalDateTime reservationEnd;

    private String reservationDetail;
}
