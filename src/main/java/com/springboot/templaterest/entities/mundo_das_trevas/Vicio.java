package com.springboot.templaterest.entities.mundo_das_trevas;

import lombok.Getter;

import java.util.Random;

public enum Vicio {
    AVAREZA("Avareza"),
    GULA("Gula"),
    INVEJA("Inveja"),
    IRA("Ira"),
    LUXURIA("Luxúria"),
    ORGULHO("Orgulho"),
    PREGUICA("Preguiça");

    @Getter private String nome;
    private static final Random ALETORIO = new Random();

    Vicio(String nome) {
        this.nome = nome;
    }

    public static Vicio vicioAleatorio() {
        return values()[ALETORIO.nextInt(values().length)];
    }
}
