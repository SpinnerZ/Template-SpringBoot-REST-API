package com.springboot.templaterest.entities.mundo_das_trevas;

import lombok.Getter;

import java.util.Random;

public enum Virtude {
    CARIDADE("Caridade"),
    ESPERANCA("Esperança"),
    FE("Fé"),
    FORTALEZA("Fortaleza"),
    JUSTICA("Justiça"),
    PRUDENCIA("Prudência"),
    TEMPERANCA("Temperança");

    @Getter private String nome;
    private static final Random ALETORIO = new Random();

    Virtude(String nome) {
        this.nome = nome;
    }

    public static Virtude virtudeAleatoria() {
        return values()[ALETORIO.nextInt(values().length)];
    }
}
