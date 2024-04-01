package com.filtro.leiderTami.domain.service;

import com.filtro.leiderTami.domain.exception.AdminIdNotFoundException;
import com.filtro.leiderTami.domain.exception.AdminNotFoundException;
import com.filtro.leiderTami.domain.exception.InvalidStateException;
import com.filtro.leiderTami.domain.repository.ContenidoAudiovisualRepository;
import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @Override
    public ResponseEntity<ContenidoAudiovisual> update(Object id, ContenidoAudiovisual contenidoUpdate) {
        try{
            Long newId = Long.parseLong(id.toString());
            Optional<ContenidoAudiovisual> optionalContenido = contenidoRepository.findById(newId);
            if(optionalContenido.isPresent()){

                ContenidoAudiovisual contenidoSend = optionalContenido.get();
                contenidoSend.setEstado(contenidoUpdate.getEstado());
                contenidoSend.setCalificacion(contenidoUpdate.getCalificacion());
                contenidoRepository.save(contenidoSend);

                return ResponseEntity.ok(contenidoSend);
            } else {
                throw new AdminNotFoundException("contenido no encontrado por dicho ID para actualizar");
            }
        }catch (NumberFormatException e){
            throw new AdminIdNotFoundException("Haz ingresado una letra u/o otro caracter diferente a un Número de tipo Long");
        }
    }


}
