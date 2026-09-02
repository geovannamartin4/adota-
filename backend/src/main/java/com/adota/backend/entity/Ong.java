package com.adota.backend.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import java.util.List;

import com.adota.backend.enums.TipoOng;
import com.adota.backend.enums.StatusOng;

@Getter
@Setter
@Entity
public class Ong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cnpj;
    private String email;
    private String senha;
    private String telefone;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private double latitude;
    private double longitude;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusOng status;
    @Enumerated(EnumType.STRING)
    private TipoOng tipo;

    @OneToMany(mappedBy = "ong")
    private List<Animal> animais;

    public Ong() {

    }
}
