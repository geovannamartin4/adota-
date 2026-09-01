package com.adota.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import com.adota.backend.enums.EspecieAnimal;
import com.adota.backend.enums.PorteAnimal;
import com.adota.backend.enums.SexoAnimal;
import com.adota.backend.enums.StatusAnimal;
import com.adota.backend.enums.UnidadeIdade;


@Entity
@Getter
@Setter
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String raca;
    private String observacao;
    private String foto;

    private int idade;
    @Enumerated(EnumType.STRING)
    private UnidadeIdade unidadeIdade;

    @ManyToOne
    @JoinColumn(name = "ong_id")
    private Ong ong;

    @Enumerated(EnumType.STRING)
    private EspecieAnimal especie;
    @Enumerated(EnumType.STRING)
    private PorteAnimal porte;
    @Enumerated(EnumType.STRING)
    private SexoAnimal sexo;
    @Enumerated(EnumType.STRING)
    private StatusAnimal status;

    public Animal () {

    }

}
