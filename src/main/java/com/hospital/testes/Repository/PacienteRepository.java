package com.hospital.testes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.testes.Model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
