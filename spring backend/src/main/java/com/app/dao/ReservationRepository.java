package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {

}
