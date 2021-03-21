package com.springboot.templaterest.services;

import com.springboot.templaterest.entities.FichaMundoDasTrevas;
import com.springboot.templaterest.entities.dtos.FichaMundoDasTrevasDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FichaMundoDasTrevasService {
    private static final Random ALEATORIO = new Random();

    public FichaMundoDasTrevasDTO gerarFichaAleatoria() {
        return new FichaMundoDasTrevasDTO(new FichaMundoDasTrevas(ALEATORIO));
    }
}
