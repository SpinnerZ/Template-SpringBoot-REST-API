package com.springboot.templaterest.entities.dtos.mundo_das_trevas.atributos;

import com.springboot.templaterest.entities.mundo_das_trevas.atributos.Mentais;
import lombok.Getter;
import lombok.Setter;

public class MentaisDTO {
    @Getter @Setter private int inteligencia;
    @Getter @Setter private int raciocinio;
    @Getter @Setter private int perseveranca;

    public MentaisDTO(Mentais mentais) {
        inteligencia = mentais.getInteligencia();
        raciocinio = mentais.getRaciocinio();
        perseveranca = mentais.getPerseveranca();
    }
}
