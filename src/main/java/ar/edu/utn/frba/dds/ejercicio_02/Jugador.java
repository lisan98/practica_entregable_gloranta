package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "jugador")
public class Jugador {

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "apellido")
  private String apellido;


  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "fechaAlta", columnDefinition = "DATETIME")
  private LocalDate fechaAlta;

  @OneToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "id_personaje")
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
