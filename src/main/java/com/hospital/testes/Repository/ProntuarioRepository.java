package com.hospital.testes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.testes.Model.Prontuario;

public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {
}
