package com.springboot.templaterest.entities.mundo_das_trevas.atributos;

import com.springboot.templaterest.entities.mundo_das_trevas.util.GeradorAleatorio;
import lombok.Getter;
import lombok.Setter;

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

    public Fisicos(int pontos) {
        this(GeradorAleatorio.atributosIniciaisAleatorios(pontos));
    }
}
