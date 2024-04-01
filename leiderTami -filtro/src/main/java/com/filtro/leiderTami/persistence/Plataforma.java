package com.filtro.leiderTami.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "Plataforma")

public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

}
