package com.api.peoplemanager.repository;

import com.api.peoplemanager.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
