package com.filtro.leiderTami.domain.repository;

import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import com.filtro.leiderTami.persistence.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<ContenidoAudiovisual> findByContenidosUsuarioId(Long idUsuario);

    List<ContenidoAudiovisual> findAllById(Long id);
}