package com.civa.buses.controller;

import com.civa.buses.dto.BusDTO;
import com.civa.buses.service.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api-v1/bus")
@RequiredArgsConstructor
public class BusController {

    private final BusService busService;

    @GetMapping()
    public Page<BusDTO> getAllBuses(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(defaultValue = "10") int size) {
        return busService.obtenerBusesPaginados(page,size);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusDTO> getBusById(@PathVariable Long id) {
        return busService.obtenerBus(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
