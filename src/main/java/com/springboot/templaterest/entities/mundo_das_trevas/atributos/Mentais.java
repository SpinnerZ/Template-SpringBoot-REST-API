package com.springboot.templaterest.entities.mundo_das_trevas.atributos;

import com.springboot.templaterest.entities.mundo_das_trevas.util.GeradorAleatorio;
import lombok.Getter;
import lombok.Setter;

public class Mentais {
    @Getter @Setter private int inteligencia;
    @Getter @Setter private int raciocinio;
    @Getter @Setter private int perseveranca;

    public Mentais(int inteligencia, int raciocinio, int perseveranca) {
        this.inteligencia = inteligencia;
        this.raciocinio = raciocinio;
        this.perseveranca = perseveranca;
    }

    public Mentais(int[] valores) {
        this(valores[0], valores[1], valores[2]);
    }

    public Mentais(int pontos) {
        this(GeradorAleatorio.atributosIniciaisAleatorios(pontos));
    }
}
