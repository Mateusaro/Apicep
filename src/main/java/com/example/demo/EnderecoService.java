package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco getEnderecoPorCep(String cep) {
        return enderecoRepository.findById(cep)
                .orElseThrow(() -> new RuntimeException("CEP não encontrado"));
    }
}
