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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public UnidadeIdade getUnidadeIdade() {
        return unidadeIdade;
    }

    public void setUnidadeIdade(UnidadeIdade unidadeIdade) {
        this.unidadeIdade = unidadeIdade;
    }

    public EspecieAnimal getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieAnimal especie) {
        this.especie = especie;
    }

    public PorteAnimal getPorte() {
        return porte;
    }

    public void setPorte(PorteAnimal porte) {
        this.porte = porte;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public StatusAnimal getStatus() {
        return status;
    }

    public void setStatus(StatusAnimal status) {
        this.status = status;
    }

    public Ong getOng() {
        return ong;
    }

    public void setOng(Ong ong) {
        this.ong = ong;
    }
}
