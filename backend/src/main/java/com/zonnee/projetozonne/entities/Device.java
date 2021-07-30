package com.zonnee.projetozonne.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDevice;
    private Double valueKw;
    private Double valueBasic;
    private Double valueIlumination;
    private Double valueSolarPanel;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idPerson")
    private Person idPerson;

    @OneToMany(mappedBy = "idDevice")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<ClockDevice> clockDevices  = new ArrayList<>();

    @OneToMany(mappedBy = "idDevice")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<InversorDevice> inversorDevices  = new ArrayList<>();

}