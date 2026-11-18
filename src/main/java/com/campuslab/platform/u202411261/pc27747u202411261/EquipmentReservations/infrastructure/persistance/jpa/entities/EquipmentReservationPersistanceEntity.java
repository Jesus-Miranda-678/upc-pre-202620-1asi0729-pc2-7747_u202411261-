package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.infrastructure.persistance.jpa.entities;


import com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.valueobjects.EquipmentBatch;
import com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.infrastructure.persistance.jpa.converters.LaboratoryIdPersistanceConverter;
import com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.infrastructure.persistance.jpa.embeddables.ReservationPeriodEmbedable;
import com.campuslab.platform.u202411261.pc27747u202411261.shared.infrastructure.persistence.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "equipment_reservations")
public class EquipmentReservationPersistanceEntity extends AuditableAbstractPersistenceEntity {


    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "equipmentbatchid", column = @Column(name = "first_name")),
            @AttributeOverride(name = "equipmentbatchname", column = @Column(name = "last_name"))})
    private EquipmentBatch equipmentBatch;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "startdate", column = @Column(name = "start_date")),
            @AttributeOverride(name = "startdate", column = @Column(name = "end_name"))})
    private ReservationPeriodEmbedable reservationPeriod;

    @Convert(converter = LaboratoryIdPersistanceConverter.class)
    private LaboratoryIdPersistanceConverter laboratoryIdPersistanceConverter;
}
