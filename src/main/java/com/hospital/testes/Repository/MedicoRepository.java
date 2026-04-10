package com.hospital.testes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.testes.Model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
