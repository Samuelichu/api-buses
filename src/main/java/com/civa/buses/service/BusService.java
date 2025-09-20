package com.civa.buses.service;

import com.civa.buses.dto.BusDTO;
import com.civa.buses.entity.Bus;
import com.civa.buses.mapper.BusMapper;
import com.civa.buses.repository.BusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BusService {
    private final BusRepository busRepository;

    public Page<BusDTO> obtenerBusesPaginados(int page, int size){
        Page<Bus> buses = busRepository.findAll(PageRequest.of(page, size));
        return buses.map(BusMapper::toDTO);
    }

    public Optional<BusDTO> obtenerBus(Long id){
        Optional<Bus> bus = busRepository.findById(id);
        return bus.map(BusMapper::toDTO);
    }


}
