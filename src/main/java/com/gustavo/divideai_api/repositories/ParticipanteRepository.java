package com.gustavo.divideai_api.repositories;

import com.gustavo.divideai_api.entities.Participante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
    List<Participante> findByGrupoId(Long idGrupo);
}
