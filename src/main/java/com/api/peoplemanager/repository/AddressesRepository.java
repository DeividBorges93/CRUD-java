package com.api.peoplemanager.repository;

import com.api.peoplemanager.entity.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressesRepository extends JpaRepository<Addresses, Long> {

}
