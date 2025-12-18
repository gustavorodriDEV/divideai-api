package com.gustavo.divideai_api.repositories;

import com.gustavo.divideai_api.entities.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo,Long> {
}
