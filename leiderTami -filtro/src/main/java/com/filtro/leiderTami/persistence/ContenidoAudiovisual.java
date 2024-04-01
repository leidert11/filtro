package com.filtro.leiderTami.persistence;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Set;

@Entity
@Table(name = "ContenidoAudiovisual")
public class ContenidoAudiovisual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;
    private Set<String> generos;

    @Enumerated(EnumType.STRING)
    private EstadoVisualizacion estado;

    private String plataforma;
    private Double calificacion;
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Set<String> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<String> generos) {
        this.generos = generos;
    }

    public EstadoVisualizacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoVisualizacion estado) {
        this.estado = estado;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
