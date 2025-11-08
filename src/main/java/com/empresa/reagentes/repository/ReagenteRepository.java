package com.empresa.reagentes.repository;

import com.empresa.reagentes.entity.Reagente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ReagenteRepository extends JpaRepository<Reagente, UUID> {
}
