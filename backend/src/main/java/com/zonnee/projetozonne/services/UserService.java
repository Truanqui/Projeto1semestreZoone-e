package com.zonnee.projetozonne.services;

import com.zonnee.projetozonne.dto.UserDTO;
import com.zonnee.projetozonne.entities.User;
import com.zonnee.projetozonne.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<UserDTO> findAll(){
        List<User> result = repository.findAll();
        return result.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
    }
}
