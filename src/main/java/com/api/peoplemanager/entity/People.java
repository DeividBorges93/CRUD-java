package com.api.peoplemanager.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data // criar getter e setter e o toString
@AllArgsConstructor // cria construtor com as propriedades de pessoa
@NoArgsConstructor // cria construtor vazio
@Builder // ajudar na criação de objetos pessoa
@Entity // informar que é uma entidade do BD

public class People implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "birthDate", nullable = false)
    private String birthDate;

    @Column(name = "addressId", nullable = false)
    private String addressId;

}
