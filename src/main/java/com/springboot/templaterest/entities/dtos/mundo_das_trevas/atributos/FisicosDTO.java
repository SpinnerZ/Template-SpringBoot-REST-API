package com.springboot.templaterest.entities.dtos.mundo_das_trevas.atributos;

import com.springboot.templaterest.entities.mundo_das_trevas.atributos.Fisicos;
import lombok.Getter;
import lombok.Setter;

public class FisicosDTO {

    @Getter @Setter private int forca;
    @Getter @Setter private int destreza;
    @Getter @Setter private int vigor;

    public FisicosDTO(Fisicos fisicos) {
        forca = fisicos.getForca();
        destreza = fisicos.getDestreza();
        vigor = fisicos.getVigor();
    }
}
