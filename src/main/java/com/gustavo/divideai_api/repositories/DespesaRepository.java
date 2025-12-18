package com.gustavo.divideai_api.repositories;

import com.gustavo.divideai_api.entities.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {

    List<Despesa> findGyByGrupoId(Long idGrupo);

    List<Despesa> findByGrupoId(Long idGrupo);
}
