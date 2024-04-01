package com.filtro.leiderTami.domain.repository;

import com.filtro.leiderTami.persistence.ContenidoAudiovisual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContenidoAudiovisualRepository extends JpaRepository<ContenidoAudiovisual, Long> {
}
