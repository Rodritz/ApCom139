package com.argentinaPrograma.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tecnico")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tecnicoId")
    private Long id;

    private String nombre;
    private Set<Servicio> especialidades;

    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
    private Set<Incidente> incidentes;

    private Set<Notificacion> mediosDeNotificacion;



}
