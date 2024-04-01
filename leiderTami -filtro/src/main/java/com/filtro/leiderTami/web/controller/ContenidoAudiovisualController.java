package com.filtro.leiderTami.web.controller;

import com.filtro.leiderTami.domain.service.ContenidoAudiovisualService;
import com.filtro.leiderTami.persistence.Admin;
import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contenido")
public class ContenidoAudiovisualController {

    @Autowired
    private ContenidoAudiovisualService contenidoService;

    @PostMapping("/crearContenido")
    public ResponseEntity<ContenidoAudiovisual> crearContenido(@RequestBody ContenidoAudiovisual contenido) {
        ContenidoAudiovisual nuevoContenido = contenidoService.crearContenido(contenido);
        return ResponseEntity.ok(nuevoContenido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContenidoAudiovisual> obtenerContenidoPorId(@PathVariable Long id) {
        ContenidoAudiovisual contenido = contenidoService.obtenerContenidoPorId(id);
        return ResponseEntity.ok(contenido);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ContenidoAudiovisual> updatecontenido( @PathVariable Object id, @RequestBody ContenidoAudiovisual updatecontenido) {
        return contenidoService.update(id, updatecontenido);
    }

}
