package com.hospital.testes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.testes.Model.Convenio;

public interface ConvenioRepository extends JpaRepository<Convenio, Long> {
}
