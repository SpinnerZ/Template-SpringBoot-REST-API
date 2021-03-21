package com.springboot.templaterest.entities.mundo_das_trevas.util;

import java.util.Random;

public class GeradorAleatorio {
    private GeradorAleatorio(){}

    private static Random gerador = new Random();

    public static int[] atributosIniciaisAleatorios(int pontos) {
        int[] atributos = {1, 1, 1};

        for (; pontos > 0; pontos--) {
            atributos[gerador.nextInt(3)]++;
        }

        return atributos;
    }
}
