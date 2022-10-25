package com.maxyar.vvtc.repositories;

import com.maxyar.vvtc.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Integer> {
}
