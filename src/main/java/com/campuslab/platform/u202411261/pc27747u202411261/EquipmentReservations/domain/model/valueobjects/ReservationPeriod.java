package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.valueobjects;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ReservationPeriod( @NotNull LocalDate startDate ,@NotNull LocalDate endDate) {


    public ReservationPeriod {

    }
}
