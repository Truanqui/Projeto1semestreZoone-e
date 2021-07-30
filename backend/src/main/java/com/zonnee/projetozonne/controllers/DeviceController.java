package com.zonnee.projetozonne.controllers;

import com.zonnee.projetozonne.dto.DeviceDTO;
import com.zonnee.projetozonne.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/devices")
public class DeviceController {

    @Autowired
    private DeviceService service;

    @GetMapping
    public ResponseEntity<List<DeviceDTO>> findAll(){
        List<DeviceDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }
    @PostMapping

}
