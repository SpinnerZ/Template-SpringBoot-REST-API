package com.springboot.templaterest.controllers;

import com.springboot.templaterest.entities.dtos.FichaMundoDasTrevasDTO;
import com.springboot.templaterest.entities.dtos.ResponseDTO;
import com.springboot.templaterest.services.FichaMundoDasTrevasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ficha/nwod")
public class FichaMundoDasTrevasController {

    @Autowired
    private FichaMundoDasTrevasService service;

    @GetMapping
    public ResponseEntity<ResponseDTO<FichaMundoDasTrevasDTO>> gerarFichaAleatoria() {
        ResponseDTO<FichaMundoDasTrevasDTO> resposta = new ResponseDTO<>(service.gerarFichaAleatoria());
        return ResponseEntity.ok(resposta);
    }
}
