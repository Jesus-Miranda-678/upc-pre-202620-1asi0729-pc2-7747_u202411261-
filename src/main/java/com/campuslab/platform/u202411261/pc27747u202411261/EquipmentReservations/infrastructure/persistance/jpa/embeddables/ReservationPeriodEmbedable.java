package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.infrastructure.persistance.jpa.embeddables;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter

@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class ReservationPeriodEmbedable {

    @Column(name = "start_date", nullable = false)
    private String startDate;
    @Column(name = "end_date", nullable = false)
    private String endDate;
}
