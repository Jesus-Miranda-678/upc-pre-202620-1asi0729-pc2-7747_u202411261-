package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.infrastructure.persistance.jpa.embeddables;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class EquipmentBatchEmbedable {

    @Column(name = "equipment_batch_id", nullable = false)
    private int quantity;

    @Column(name = "equipment_batch_name", nullable = false)
    private String unit;
}
