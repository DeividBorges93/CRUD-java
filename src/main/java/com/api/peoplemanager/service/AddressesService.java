package com.api.peoplemanager.service;

import com.api.peoplemanager.entity.Addresses;
import com.api.peoplemanager.repository.AddressesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressesService {

    @Autowired
    private AddressesRepository addressesRepository;

    public Addresses salvar(Addresses addresses) {
        return addressesRepository.save(addresses);
    }

    public List<Addresses> listPeople() {
        return addressesRepository.findAll();
    }

    public Optional<Addresses> searchById(Long id) {
        return addressesRepository.findById(id);
    }

    public void removeById(Long id) {
        addressesRepository.deleteById(id);
    }
}
