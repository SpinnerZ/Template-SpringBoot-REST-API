package com.springboot.templaterest.entities.dtos.mundo_das_trevas.atributos;

import com.springboot.templaterest.entities.mundo_das_trevas.atributos.Sociais;
import lombok.Getter;
import lombok.Setter;

public class SociaisDTO {
    @Getter @Setter private int presenca;
    @Getter @Setter private int manipulacao;
    @Getter @Setter private int autocontrole;

    public SociaisDTO(Sociais sociais) {
        presenca = sociais.getPresenca();
        manipulacao = sociais.getManipulacao();
        autocontrole = sociais.getAutocontrole();
    }
}
