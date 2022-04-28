package com.example.BS9.infrastructure.dto.input;

import com.example.BS9.domain.PersonaEntity;
import com.example.BS9.domain.ProfesorEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ProfesorInputDTO {

  private String id_profesor;
  private PersonaEntity persona;
  private String coments;
  private String branch;
  public ProfesorInputDTO(ProfesorEntity profesor)
  {
    setId_profesor(profesor.getId_profesor());
    setPersona(profesor.getPersona());
    setComents(profesor.getComents());
    setBranch((profesor.getBranch()));

  }

}
