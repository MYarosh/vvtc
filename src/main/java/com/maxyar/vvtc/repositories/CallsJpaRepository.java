package com.maxyar.vvtc.repositories;

import com.maxyar.vvtc.entities.Calls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallsJpaRepository extends JpaRepository<Calls, Integer> {
}
