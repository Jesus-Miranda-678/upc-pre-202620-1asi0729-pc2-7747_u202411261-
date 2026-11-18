package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.valueobjects;

public record ReservationCode(String Code) {
    public ReservationCode {
        if (Code == null || Code.isBlank()) {
            throw new IllegalArgumentException("Code must not be null or blank");
        }
    }
}
