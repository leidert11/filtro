package com.filtro.leiderTami.domain.service;

import com.filtro.leiderTami.domain.exception.InvalidStateException;
import com.filtro.leiderTami.domain.repository.ContenidoAudiovisualRepository;
import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import com.filtro.leiderTami.persistence.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContenidoAudiovisualService implements ServiceInterface<ContenidoAudiovisual>{

    @Autowired
    private ContenidoAudiovisualRepository contenidoRepository;

    public ContenidoAudiovisual crearContenido(ContenidoAudiovisual contenido) {
        if (contenido.getNombre() == null || contenido.getTipo() == null || contenido.getGeneros() == null) {
            throw new InvalidStateException("Los datos del pedido no pueden estar vacios");
        }
        return contenidoRepository.save(contenido);
    }

    public ContenidoAudiovisual obtenerContenidoPorId(Long id) {
        return contenidoRepository.findById(id).orElse(null);
    }

    @Override
    public List<ContenidoAudiovisual> findAll() {
        return null;
    }

    @Override
    public Optional<ContenidoAudiovisual> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public ContenidoAudiovisual save(ContenidoAudiovisual object) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public ContenidoAudiovisual update(ContenidoAudiovisual object) {
        return null;
    }
}
