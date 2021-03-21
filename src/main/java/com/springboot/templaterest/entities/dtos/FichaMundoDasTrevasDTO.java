package com.springboot.templaterest.entities.dtos;

import com.springboot.templaterest.entities.FichaMundoDasTrevas;
import com.springboot.templaterest.entities.dtos.mundo_das_trevas.AtributosDTO;
import lombok.Getter;
import lombok.Setter;

public class FichaMundoDasTrevasDTO {

    @Getter @Setter private String nome;
    @Getter @Setter private Integer idade;
    @Getter @Setter private String jogador;
    @Getter @Setter private String conceito;
    @Getter @Setter private String virtude;
    @Getter @Setter private String vicio;
    @Getter @Setter private String cronica;
    @Getter @Setter private String faccao;
    @Getter @Setter private String nomeDoGrupo;

    @Getter @Setter private AtributosDTO atributosDTO;

    public FichaMundoDasTrevasDTO(FichaMundoDasTrevas ficha) {
        nome = ficha.getNome();
        idade = ficha.getIdade();
        jogador = ficha.getJogador();
        conceito = ficha.getConceito();
        virtude = ficha.getVirtude();
        vicio = ficha.getVicio();
        cronica = ficha.getCronica();
        faccao = ficha.getFaccao();
        nomeDoGrupo = ficha.getNomeDoGrupo();
        atributosDTO = new AtributosDTO(ficha.getAtributos());
    }
}
