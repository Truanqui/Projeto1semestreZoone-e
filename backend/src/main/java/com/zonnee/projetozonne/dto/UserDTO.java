package com.zonnee.projetozonne.dto;

import com.zonnee.projetozonne.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idUser;
    private String email;
    private String password;
    private String role;
    private Person person;

    public UserDTO(User entity) {
        idUser = entity.getIdUser();
        email = entity.getEmail();
        password = entity.getPassword();
        role = entity.getRole();
        person = entity.getPerson();
    }
}

