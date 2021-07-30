package com.zonnee.projetozonne.dto;

import com.zonnee.projetozonne.entities.Device;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceDTO  implements Serializable {

    private Long idDevice;
    private Double valueKw;
    private Double valueBasic;
    private Double valueIlumination;
    private Double valueSolarPanel;

    private List<ListClockDeviceDTO>  clockDeviceDTOS = new ArrayList<>();
    private List<ListInversorDeviceDTO> inversorDeviceDTOS = new ArrayList<>();

    public DeviceDTO(Device entity) {
        idDevice = entity.getIdDevice();
        valueKw = entity.getValueKw();
        valueBasic = entity.getValueBasic();
        valueIlumination = entity.getValueIlumination();
        valueSolarPanel = entity.getValueSolarPanel();
        clockDeviceDTOS = entity.getClockDevices().stream().map(clockDevice -> new ListClockDevicesDTO(clockDevice)).collect(Collectors.toList());
        inversorDeviceDTOS = entity.getInversorDevices().stream().map(inversorDevice -> new ListInversorDeviceDTO(inversorDevice)).collect(Collectors.toList());
    }
}

