package com.zonnee.projetozonne.repositories;

import com.zonnee.projetozonne.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail (String email);
}
