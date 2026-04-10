package com.hospital.testes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.testes.Model.Prontuario;
import com.hospital.testes.Repository.ProntuarioRepository;

import java.util.List;

@Service
public class ProntuarioService {

    @Autowired
    private ProntuarioRepository repository;

    public List<Prontuario> listarTodos() {
        return repository.findAll();
    }

    public Prontuario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não encontrado"));
    }

    public Prontuario salvar(Prontuario obj) {
        return repository.save(obj);
    }

    public Prontuario atualizar(Long id, Prontuario novo) {
        Prontuario obj = buscarPorId(id);
        obj.setTipoSanguineo(novo.getTipoSanguineo());
        obj.setAlergia(novo.getAlergia());
        obj.setObservacoes(novo.getObservacoes());
        return repository.save(obj);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}