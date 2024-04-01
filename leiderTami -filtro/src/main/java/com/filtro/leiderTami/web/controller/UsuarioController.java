package com.filtro.leiderTami.web.controller;

import com.filtro.leiderTami.domain.service.UsuarioService;
import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import com.filtro.leiderTami.persistence.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        Usuario nuevoUsuario = usuarioService.crearUsuario(usuario);
        return ResponseEntity.ok(nuevoUsuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(id);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/{id}/contenidos")
    public ResponseEntity<List<ContenidoAudiovisual>> obtenerContenidosPorUsuario(@PathVariable Long id) {
        List<ContenidoAudiovisual> contenidos = usuarioService.obtenerContenidosPorUsuario(id);
        return ResponseEntity.ok(contenidos);
    }

}
