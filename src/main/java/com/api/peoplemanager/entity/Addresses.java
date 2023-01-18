package com.api.peoplemanager.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data // criar getter e setter e o toString
@AllArgsConstructor // cria construtor com as propriedades de endereço
@NoArgsConstructor // cria construtor vazio
@Builder // ajudar na criação de objetos endereço
@Entity // informar que é uma entidade do BD

public class Addresses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "publicPlace", nullable = false)
    private String publicPlace;

    @Column(name = "zipCode", nullable = false)
    private String zipCode;

    @Column(name = "number", nullable = false)
    private Number number;

}
