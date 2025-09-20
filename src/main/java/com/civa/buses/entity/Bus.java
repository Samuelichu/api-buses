package com.civa.buses.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numBus;
    private String placa;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;
    private String Caracteristicas;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;
    private boolean estado;

}
