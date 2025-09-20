package com.civa.buses.service;

import com.civa.buses.dto.BusDTO;
import com.civa.buses.entity.Bus;
import com.civa.buses.mapper.BusMapper;
import com.civa.buses.repository.BusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BusService {
    private final BusRepository busRepository;

    public List<BusDTO> obtenerBuses(){
        List<Bus> buses = busRepository.findAll();

        // Convertimos cada Bus a BusDTO usando el mapper
        return buses.stream()
                .map(BusMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<BusDTO> obtenerBus(Long id){
        Optional<Bus> bus = busRepository.findById(id);
        return bus.map(BusMapper::toDTO);
    }


}
