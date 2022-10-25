package com.maxyar.vvtc.repositories;

import com.maxyar.vvtc.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageJpaRepository extends JpaRepository<Message, Integer> {
}
