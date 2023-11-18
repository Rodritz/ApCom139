package com.argentinaPrograma.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteId")
    private Long id;

    private String razonSocial;
    private String Cuit;
    private Set<Servicio> serviciosContratados;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Set<Incidente> incidentes;

}
