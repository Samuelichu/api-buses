package com.civa.buses.mapper;

import com.civa.buses.dto.BusDTO;
import com.civa.buses.entity.Bus;

public class BusMapper {
    public static BusDTO toDTO(Bus bus) {
        return new BusDTO(
                bus.getId(),
                bus.getNumBus(),
                bus.getPlaca(),
                bus.getFechaCreacion(),
                bus.getCaracteristicas(),
                bus.isEstado(),
                bus.getMarca() != null ? bus.getMarca().getNombreMarca() : null
        );
    }
}
