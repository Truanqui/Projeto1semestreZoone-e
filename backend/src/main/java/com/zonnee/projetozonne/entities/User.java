package com.zonnee.projetozonne.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String email;
    private String password;
    private String role;

    @OneToOne(mappedBy = "idUser")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Person person;

}
