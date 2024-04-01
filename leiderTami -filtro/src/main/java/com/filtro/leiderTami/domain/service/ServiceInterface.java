package com.filtro.leiderTami.domain.service;

import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ServiceInterface<T> {
    List<T> findAll();
    Optional<T> findById(Integer id);
    T save(T object);
    void deleteById(Integer id);
    T update(T object);

    ResponseEntity<ContenidoAudiovisual> update(Object id, ContenidoAudiovisual contenidoUpdate);
}