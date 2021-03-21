package com.springboot.templaterest.entities.dtos.mundo_das_trevas;

import com.springboot.templaterest.entities.dtos.mundo_das_trevas.atributos.FisicosDTO;
import com.springboot.templaterest.entities.dtos.mundo_das_trevas.atributos.MentaisDTO;
import com.springboot.templaterest.entities.dtos.mundo_das_trevas.atributos.SociaisDTO;
import com.springboot.templaterest.entities.mundo_das_trevas.Atributos;
import lombok.Getter;
import lombok.Setter;

public class AtributosDTO {

    @Getter @Setter private MentaisDTO mentaisDTO;
    @Getter @Setter private FisicosDTO fisicosDTO;
    @Getter @Setter private SociaisDTO sociaisDTO;

    public AtributosDTO(Atributos atributos) {
        mentaisDTO = new MentaisDTO(atributos.getMentais());
        fisicosDTO = new FisicosDTO(atributos.getFisicos());
        sociaisDTO = new SociaisDTO(atributos.getSociais());
    }
}
