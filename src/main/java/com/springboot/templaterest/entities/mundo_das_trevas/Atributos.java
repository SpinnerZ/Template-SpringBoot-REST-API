package com.springboot.templaterest.entities.mundo_das_trevas;

import com.springboot.templaterest.entities.mundo_das_trevas.atributos.Fisicos;
import com.springboot.templaterest.entities.mundo_das_trevas.atributos.Mentais;
import com.springboot.templaterest.entities.mundo_das_trevas.atributos.Sociais;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Atributos {
    private static final int[] VALORES_PADRAO = {5, 4, 3};

    @Getter @Setter private Mentais mentais;
    @Getter @Setter private Fisicos fisicos;
    @Getter @Setter private Sociais sociais;

    public Atributos(Mentais mentais, Fisicos fisicos, Sociais sociais) {
        this.mentais = mentais;
        this.fisicos = fisicos;
        this.sociais = sociais;
    }

    public Atributos(int pontosMentais, int pontosFisicos, int pontosSociais, Random aleatorio) {
        mentais = new Mentais(pontosMentais, aleatorio);
        fisicos = new Fisicos(pontosFisicos, aleatorio);
        sociais = new Sociais(pontosSociais, aleatorio);
    }

    public Atributos(int[] primarios, Random aleatorio) {
        mentais = new Mentais(primarios[0], aleatorio);
        fisicos = new Fisicos(primarios[1], aleatorio);
        sociais = new Sociais(primarios[2], aleatorio);
    }

    public Atributos(Random aleatorio) {
        this(sorteiaPrimarios(VALORES_PADRAO, aleatorio), aleatorio);
    }


    static int[] sorteiaPrimarios(int[] valorAtributos, Random aleatorio) {
        List<Integer> atributos = Arrays.stream(valorAtributos).boxed().collect(Collectors.toList());
        int quantidadeDeElementos = atributos.size();
        int[] primarios = new int[quantidadeDeElementos];

        for (int i = 0; i < quantidadeDeElementos; i++) {
            int randomIndex = aleatorio.nextInt(atributos.size());
            primarios[i] = atributos.get(randomIndex);
            atributos.remove(randomIndex);
        }

        return primarios;
    }

    public static int[] atributosIniciaisAleatorios(int pontos, Random aleatorio) {
        int[] atributos = {1, 1, 1};
        boolean[] atributosFlag = {false, false, false};

        for (; pontos > 0 && !(atributosFlag[0] && atributosFlag[1] && atributosFlag[2]); pontos--) {
            int posicao = aleatorio.nextInt(atributos.length);

            if (atributos[posicao] >= 4) {
                if (pontos >= 2) {
                    pontos--;
                } else {
                    pontos++;
                    atributosFlag[posicao] = true;
                    continue;
                }
            }

            atributos[posicao]++;
        }

        return atributos;
    }
}
