package com.api.peoplemanager.service;

import com.api.peoplemanager.entity.People;
import com.api.peoplemanager.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    public People salvar(People people) {
        return peopleRepository.save(people);
    }

    public List<People> listPeople() {
        return peopleRepository.findAll();
    }

    public Optional<People> searchById(Long id) {
        return peopleRepository.findById(id);
    }

    public void removeById(Long id) {
        peopleRepository.deleteById(id);
    }
}
