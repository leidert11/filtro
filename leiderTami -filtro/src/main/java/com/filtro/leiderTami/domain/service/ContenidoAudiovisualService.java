package com.filtro.leiderTami.domain.service;

import com.filtro.leiderTami.domain.repository.ContenidoAudiovisualRepository;
import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContenidoAudiovisualService {

    @Autowired
    private ContenidoAudiovisualRepository contenidoRepository;

    public ContenidoAudiovisual crearContenido(ContenidoAudiovisual contenido) {
        return contenidoRepository.save(contenido);
    }

    public ContenidoAudiovisual obtenerContenidoPorId(Long id) {
        return contenidoRepository.findById(id).orElse(null);
    }

}
