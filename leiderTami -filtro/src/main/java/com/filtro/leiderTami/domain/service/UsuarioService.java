package com.filtro.leiderTami.domain.service;

import com.filtro.leiderTami.domain.repository.UsuarioRepository;
import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import com.filtro.leiderTami.persistence.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class UsuarioService implements ServiceInterface<Usuario>{

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return Optional.empty();
    }

    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario save(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("El usuario no puede estar vacío");
        }
        if (usuario.getNombre() == null || usuario.getCorreoElectronico() == null) {
            throw new IllegalArgumentException("Los valores no pueden estar vacíos");
        }
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteById(Integer id) {

    }

    public void deleteById(Long id) {
        List<ContenidoAudiovisual> contenidoAudiovisuals = usuarioRepository.findAllById(id);
        usuarioRepository.deleteById(id);
    }

    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<ContenidoAudiovisual> obtenerContenidosPorUsuario(Long idUsuario) {
        Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
        if (usuario.isPresent()) {
            return usuario.get().getContenidos();
        } else {
            throw new IllegalArgumentException("Usuario no encontrado");
        }
    }
}