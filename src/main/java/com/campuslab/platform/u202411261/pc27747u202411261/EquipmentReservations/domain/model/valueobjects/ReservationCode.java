package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.valueobjects;

import jakarta.validation.constraints.NotEmpty;

public record ReservationCode(@NotEmpty String Code) {
    public ReservationCode {
        if (Code == null || Code.isBlank()) {
            throw new IllegalArgumentException("Code must not be null or blank");
        }
    }
}
