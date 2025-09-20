package com.civa.buses.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class BusDTO {
    private long id;
    private int numBus;
    private String placa;
    private LocalDateTime fechaCreacion;
    private String caracteristicas;
    private boolean estado;
    private String nombreMarca;
}
