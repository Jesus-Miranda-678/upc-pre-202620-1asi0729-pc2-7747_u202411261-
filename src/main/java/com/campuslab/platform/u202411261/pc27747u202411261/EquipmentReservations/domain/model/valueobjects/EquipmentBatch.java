package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.valueobjects;

public record EquipmentBatch(Integer quantity, String unit) {
    private static int MAXVALUE;
    public EquipmentBatch {

        if (quantity== null ) {
            throw new IllegalArgumentException("quantity  must not be null or blank");
        }

        if (unit== null || unit.isBlank()) {
            throw new IllegalArgumentException("unit must not be null or blank");
        }
    }


    EquipmentBatch  addUnits(Integer additionalQuantity){
        if (additionalQuantity ==null || additionalQuantity < 1) {
            throw new IllegalArgumentException("unit must not be null or blank");
        }
        return new EquipmentBatch(this.quantity + additionalQuantity, this.unit);
    }
}
