package com.maxyar.vvtc.repositories;

import com.maxyar.vvtc.entities.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsJpaRepository extends JpaRepository<Contacts, Integer> {
}
