package com.hospital.testes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.testes.Model.Paciente;
import com.hospital.testes.Repository.PacienteRepository;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    public Paciente buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não encontrado"));
    }

    public Paciente salvar(Paciente obj) {
        return repository.save(obj);
    }

    public Paciente atualizar(Long id, Paciente novo) {
        Paciente obj = buscarPorId(id);
        obj.setNome(novo.getNome());
        obj.setCpf(novo.getCpf());
        obj.setTelefone(novo.getTelefone());
        return repository.save(obj);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}