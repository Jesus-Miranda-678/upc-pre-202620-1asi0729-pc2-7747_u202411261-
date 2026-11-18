package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.valueobjects;

import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

public record LaboratoryId(@NotEmpty UUID value) {

    public LaboratoryId {
        if (value== null) {
            throw new IllegalArgumentException("value name must not be null ");
        }
    }
}
