package com.hospital.testes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.testes.Model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
