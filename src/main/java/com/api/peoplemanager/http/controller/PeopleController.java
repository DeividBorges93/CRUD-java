package com.api.peoplemanager.http.controller;

import com.api.peoplemanager.entity.People;
import com.api.peoplemanager.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

//    @Autowired
//    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public People salvar(@RequestBody People people) {
        return peopleService.salvar(people);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<People> listPeople() {
        return peopleService.listPeople();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public People searchPeopleById(@PathVariable("id") Long id) {
        return peopleService.searchById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrada"));

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removePeople(@PathVariable("id") Long id) {
        peopleService.searchById(id)
                .map(people -> {
                    peopleService.removeById(people.getId());
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrada"));
    }

//    @PutMapping("{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void updatePeople(@PathVariable("id") Long id, @RequestBody People people) {
//        peopleService.searchById(id)
//                .map(peopleBase -> {
//                    modelMapper.map(people, peopleBase);
//                      peopleService.salvar(peopleBase);
//                    return Void.TYPE;
//                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrada"));
//    }
}
