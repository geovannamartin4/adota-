package com.adota.backend.service;

import com.adota.backend.entity.Ong;
import com.adota.backend.repository.OngRepository;
import org.springframework.stereotype.Service;

@Service
public class OngService {

    private final OngRepository ongRepository;

    public OngService(OngRepository ongRepository) {
        this.ongRepository = ongRepository;
    }

    public Ong cadastrar(Ong ong) {
        if (ong.getNome() == null || ong.getNome().isBlank()) {
            throw new RuntimeException("O nome da Ong é obrigatório.");
        }

        if (ong.getCnpj() == null || ong.getCnpj().isBlank()) {
        throw new RuntimeException("O CNPJ é obrigatório.");
        }

        String cnpj = ong.getCnpj().replaceAll("\\D", "");

        if (cnpj.length() != 14) {
        throw new RuntimeException("O CNPJ deve possuir 14 dígitos.");
        }

        if (ong.getEmail() == null || ong.getEmail().isBlank()) {
        throw new RuntimeException("O email é obrigatório.");
        }

        if (!ong.getEmail().contains("@")) {
        throw new RuntimeException("Digite um email válido.");
        }

        if (ong.getSenha() == null || ong.getSenha().isBlank() || ong.getSenha().length() < 4) {
            throw new RuntimeException("A senha deve possuir no mínimo 4 caracteres.");
        }

        if (ong.getTelefone() == null || ong.getTelefone().isBlank() || ong.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 dígitos.");
        }

        if (ong.getCep() == null || ong.getCep().isBlank()) {
            throw new RuntimeException("O CEP é obrigatório.");
        } 
        
        if (cep.length() != 8) {
            throw new RuntimeException("O CEP deve possuir 8 dígitos.");
        }

        String cep = ong.getCep().replaceAll("\\D", "");

        if (ong.getNumero() == null) {
            throw new RuntimeException("O número é obrigatório.");
        }

        if (ong.getTipo() == null) {
            throw new RuntimeException("O tipo da ONG é obrigatório.");
        }

        ong.setCnpj(cnpj);
        ong.setCep(cep);
        return ongRepository.save(ong);


    }

}

