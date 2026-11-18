package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.agregates;

import com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.valueobjects.*;
import com.campuslab.platform.u202411261.pc27747u202411261.shared.domain.model.aggregates.AbstractDomainAggregateRoot;
import lombok.Getter;

public class EquipmentReservation extends AbstractDomainAggregateRoot<EquipmentReservation> {
@Getter
    private Long id;
    private ReservationCode reservationCode;
    private LaboratoryId laboratoryId;



    private ReservationPeriod reservationPeriod ;
    private EquipmentBatch equipmentBatch ;
    private  Integer accessLevel ;
    private ReservationStatus status;
    private String reservationNotes ;





    public EquipmentReservation(String reservationNotes, ReservationStatus status, Integer accessLevel, EquipmentBatch equipmentBatch, ReservationPeriod reservationPeriod, LaboratoryId laboratoryId, ReservationCode reservationCode, Long id) {
        this.reservationNotes = reservationNotes;
        this.status = status;
        this.accessLevel = accessLevel;
        this.equipmentBatch = equipmentBatch;
        this.reservationPeriod = reservationPeriod;
        this.laboratoryId = laboratoryId;
        this.reservationCode = reservationCode;
        this.id = id;
    }

}
