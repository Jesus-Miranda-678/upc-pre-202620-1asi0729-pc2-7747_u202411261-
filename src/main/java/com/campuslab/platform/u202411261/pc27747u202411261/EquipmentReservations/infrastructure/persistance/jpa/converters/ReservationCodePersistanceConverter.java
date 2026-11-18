package com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.infrastructure.persistance.jpa.converters;


import com.campuslab.platform.u202411261.pc27747u202411261.EquipmentReservations.domain.model.valueobjects.ReservationCode;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class ReservationCodePersistanceConverter implements AttributeConverter<ReservationCode, String> {
    @Override
    public String convertToDatabaseColumn(ReservationCode attribute) {
        return attribute == null ? null : attribute.Code();
    }

    @Override
    public ReservationCode convertToEntityAttribute(String dbData) {
        return new ReservationCode(dbData);
    }


}
