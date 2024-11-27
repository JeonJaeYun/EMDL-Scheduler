package com.example.EMDL.Scheduler.domain.reservation.repository;

import com.example.EMDL.Scheduler.domain.reservation.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
