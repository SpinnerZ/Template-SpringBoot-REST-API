package com.springboot.templaterest.entities.mundo_das_trevas;

import com.springboot.templaterest.entities.mundo_das_trevas.atributos.Fisicos;
import com.springboot.templaterest.entities.mundo_das_trevas.atributos.Mentais;
import com.springboot.templaterest.entities.mundo_das_trevas.atributos.Sociais;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Atributos {
    private static final List<Integer> VALORES_PADRAO = new ArrayList<>(List.of(5, 4, 3));
    private static Random rand = new Random();

    @Getter @Setter private Mentais mentais;
    @Getter @Setter private Fisicos fisicos;
    @Getter @Setter private Sociais sociais;

    public Atributos(Mentais mentais, Fisicos fisicos, Sociais sociais) {
        this.mentais = mentais;
        this.fisicos = fisicos;
        this.sociais = sociais;
    }

    public Atributos(int pontosMentais, int pontosFisicos, int pontosSociais) {
        mentais = new Mentais(pontosMentais);
        fisicos = new Fisicos(pontosFisicos);
        sociais = new Sociais(pontosSociais);
    }

    public Atributos(int[] primarios) {
        mentais = new Mentais(primarios[0]);
        fisicos = new Fisicos(primarios[1]);
        sociais = new Sociais(primarios[2]);
    }

    public Atributos() {
        this(sorteiaPrimarios(VALORES_PADRAO));
    }

    static int[] sorteiaPrimarios(List<Integer> atributos) {
        int quantidadeDeElementos = atributos.size();
        int[] primarios = new int[quantidadeDeElementos];

        for (int i = 0; i < quantidadeDeElementos; i++) {
            int randomIndex = rand.nextInt(atributos.size());
            primarios[i] = atributos.get(randomIndex);
            atributos.remove(randomIndex);
        }

        return primarios;
    }
}
