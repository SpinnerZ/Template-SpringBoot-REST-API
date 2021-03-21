package com.springboot.templaterest.entities.mundo_das_trevas.habilidades;

import lombok.Getter;

import java.util.Random;

public enum MentaisEnum {
    CIENCIAS("Ciências"),
    ERUDICAO("Erudição"),
    INFORMATICA("Informática"),
    INVESTIGACAO("Investigação"),
    MEDICINA("Medicina"),
    OCULTISMO("Ocultismo"),
    OFICIOS("Ofícios"),
    POLITICA("Política");

    @Getter private String nome;


    MentaisEnum(String nome) {
        this.nome = nome;
    }
}
