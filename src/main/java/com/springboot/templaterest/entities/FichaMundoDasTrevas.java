package com.springboot.templaterest.entities;

import com.springboot.templaterest.entities.mundo_das_trevas.Atributos;
import com.springboot.templaterest.entities.mundo_das_trevas.Vicio;
import com.springboot.templaterest.entities.mundo_das_trevas.Virtude;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

public class FichaMundoDasTrevas {

    @Getter @Setter private String nome;
    @Getter @Setter private Integer idade;
    @Getter @Setter private String jogador;
    @Getter @Setter private String conceito;
    @Getter @Setter private String virtude;
    @Getter @Setter private String vicio;
    @Getter @Setter private String cronica;
    @Getter @Setter private String faccao;
    @Getter @Setter private String nomeDoGrupo;

    @Getter @Setter private Atributos atributos;

    public FichaMundoDasTrevas(Random aleatorio) {
        virtude = Virtude.virtudeAleatoria(aleatorio).getNome();
        vicio = Vicio.vicioAleatorio(aleatorio).getNome();
        atributos = new Atributos(aleatorio);
    }
}
