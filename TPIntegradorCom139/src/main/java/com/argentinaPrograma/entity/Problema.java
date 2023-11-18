package com.argentinaPrograma.entity;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "problema")
public class Problema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "problemaId")
    private Long id;

    private String descripcion;

    @OneToOne(mappedBy = "problema", cascade = CascadeType.ALL)
    private Incidente incidente;

    @Column(name = "complejidad")
    private boolean esComplejo;

}
