package com.api.peoplemanager.http.controller;

import com.api.peoplemanager.entity.Addresses;
import com.api.peoplemanager.service.AddressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressesController {

    @Autowired
    private AddressesService addressesService;

//    @Autowired
//    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Addresses salvar(@RequestBody Addresses addresses) {
        return addressesService.salvar(addresses);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Addresses> listAddresses() {
        return addressesService.listPeople();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Addresses searchAddressById(@PathVariable("id") Long id) {
        return addressesService.searchById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Endereço não encontrado"));

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeAddress(@PathVariable("id") Long id) {
        addressesService.searchById(id)
                .map(people -> {
                    addressesService.removeById(people.getId());
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Endereço não encontrado"));
    }

//    @PutMapping("{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void updateAddress(@PathVariable("id") Long id, @RequestBody People people) {
//        peopleService.searchById(id)
//                .map(peopleBase -> {
//                    modelMapper.map(people, peopleBase);
//                      peopleService.salvar(peopleBase);
//                    return Void.TYPE;
//                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Endereço não encontrado"));
//    }
}
