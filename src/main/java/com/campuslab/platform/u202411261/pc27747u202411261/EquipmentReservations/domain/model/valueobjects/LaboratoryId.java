package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.valueobjects;

import java.util.UUID;

public record LaboratoryId(UUID value) {

    public LaboratoryId {
        if (value== null) {
            throw new IllegalArgumentException("value name must not be null ");
        }
    }
}
