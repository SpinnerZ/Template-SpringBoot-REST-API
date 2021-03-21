package com.springboot.templaterest.entities.mundo_das_trevas.atributos;

import com.springboot.templaterest.entities.mundo_das_trevas.Atributos;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

public class Fisicos {
    @Getter @Setter private int forca;
    @Getter @Setter private int destreza;
    @Getter @Setter private int vigor;

    public Fisicos(int forca, int destreza, int vigor) {
        this.forca = forca;
        this.destreza = destreza;
        this.vigor = vigor;
    }

    public Fisicos(int[] valores) {
        this(valores[0], valores[1], valores[2]);
    }

    public Fisicos(int pontos, Random aleatorio) {
        this(Atributos.atributosIniciaisAleatorios(pontos, aleatorio));
    }
}
