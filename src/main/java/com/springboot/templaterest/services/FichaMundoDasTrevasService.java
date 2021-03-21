package com.springboot.templaterest.services;

import com.springboot.templaterest.entities.FichaMundoDasTrevas;
import com.springboot.templaterest.entities.dtos.FichaMundoDasTrevasDTO;
import org.springframework.stereotype.Service;

@Service
public class FichaMundoDasTrevasService {

    public FichaMundoDasTrevasDTO gerarFichaAleatoria() {
        return new FichaMundoDasTrevasDTO(new FichaMundoDasTrevas());
    }
}
