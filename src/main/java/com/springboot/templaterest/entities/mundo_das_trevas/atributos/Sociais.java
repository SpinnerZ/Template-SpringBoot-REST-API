package com.springboot.templaterest.entities.mundo_das_trevas.atributos;

import com.springboot.templaterest.entities.mundo_das_trevas.util.GeradorAleatorio;
import lombok.Getter;
import lombok.Setter;

public class Sociais {
    @Getter @Setter private int presenca;
    @Getter @Setter private int manipulacao;
    @Getter @Setter private int autocontrole;

    public Sociais(int presenca, int manipulacao, int autocontrole) {
        this.presenca = presenca;
        this.manipulacao = manipulacao;
        this.autocontrole = autocontrole;
    }

    public Sociais(int[] valores) {
        this(valores[0], valores[1], valores[2]);
    }

    public Sociais(int pontos) {
        this(GeradorAleatorio.atributosIniciaisAleatorios(pontos));
    }
}
