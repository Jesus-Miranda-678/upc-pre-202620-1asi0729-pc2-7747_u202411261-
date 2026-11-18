package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.repositories;

import com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.agregates.EquipmentReservation;

import java.util.Optional;

public interface EquipmentReservationsRepository {

    Optional<EquipmentReservation> findById(Long id);
    void save(EquipmentReservation equipmentReservation);

}
