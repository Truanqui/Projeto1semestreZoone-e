package com.zonnee.projetozonne.services;

import com.zonnee.projetozonne.dto.DeviceDTO;
import com.zonnee.projetozonne.entities.Device;
import com.zonnee.projetozonne.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository repository;

    public List<DeviceDTO> findAll(){
         List<Device> result = repository.findAll();
        return result.stream().map(x -> new DeviceDTO(x)).collect(Collectors.toList());
    }
}
