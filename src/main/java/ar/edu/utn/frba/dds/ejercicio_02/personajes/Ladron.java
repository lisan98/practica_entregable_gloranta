package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Inheritance;

@Getter
@Setter
@Inheritance()
public class Ladron extends Personaje{
  @Column(name = "nivelSiniestro")
  private Integer nivelSiniestro;
  @Column(name = "tieneNavaja")
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
 //TODO
  }
}
