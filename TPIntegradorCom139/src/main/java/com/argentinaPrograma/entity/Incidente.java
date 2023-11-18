package com.argentinaPrograma.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "incidente")
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "incidenteId")
    private Long id;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="cliente_id", referencedColumnName="clienteId")
    private Cliente cliente;

    private Set<Servicio> servicios;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="problema_id", referencedColumnName="problemaId")
    private Problema problema;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="tecnicoAsignado_id", referencedColumnName="tecnicoId")
    private Tecnico tecnicoAsignado;

    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaResolucion;
    private EstadoIncidente estado;

}
