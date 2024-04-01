package com.filtro.leiderTami.domain.service;

import com.filtro.leiderTami.domain.repository.UsuarioRepository;
import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import com.filtro.leiderTami.persistence.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario) {
        if( usuario == null ) {
            throw new IllegalArgumentException("El usuario no puede estar vacio");
        }
        if( usuario.getNombre() == null || usuario.getCorreoElectronico() == null ) {
            throw new IllegalArgumentException("valores no pueden estar vacio");
        }

        return usuarioRepository.save(usuario);
    }

    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public List<ContenidoAudiovisual> obtenerContenidosPorUsuario(Long idUsuario) {
        return usuarioRepository.obtenerContenidosPorUsuario(idUsuario);
    }
}
