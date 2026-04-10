package com.hospital.testes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.testes.Model.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}
