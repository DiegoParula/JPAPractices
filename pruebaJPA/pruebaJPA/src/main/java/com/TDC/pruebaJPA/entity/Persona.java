package com.TDC.pruebaJPA.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String edad;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
