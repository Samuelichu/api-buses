package com.civa.buses.controller;

import com.civa.buses.dto.BusDTO;
import com.civa.buses.service.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-v1/buses")
@RequiredArgsConstructor
public class BusController {

    private final BusService busService;

    @GetMapping()
    public ResponseEntity<List<BusDTO>> getAllBuses() {
        return ResponseEntity.ok(busService.obtenerBuses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusDTO> getBusById(@PathVariable Long id) {
        return busService.obtenerBus(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
