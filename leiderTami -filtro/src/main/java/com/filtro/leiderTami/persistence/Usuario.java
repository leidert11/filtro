package com.filtro.leiderTami.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correoElectronico;

    @OneToMany(mappedBy = "usuario")
    private List<ContenidoAudiovisual> contenidos;

    public Usuario(Long id, String nombre, String correoElectronico, List<ContenidoAudiovisual> contenidos) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contenidos = contenidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<ContenidoAudiovisual> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<ContenidoAudiovisual> contenidos) {
        this.contenidos = contenidos;
    }
}
