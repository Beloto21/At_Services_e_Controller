package com.hospital.testes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.testes.Model.Receita;
import com.hospital.testes.Repository.ReceitaRepository;

import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository repository;

    public List<Receita> listarTodos() {
        return repository.findAll();
    }

    public Receita buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não encontrado"));
    }

    public Receita salvar(Receita obj) {
        return repository.save(obj);
    }

    public Receita atualizar(Long id, Receita novo) {
        Receita obj = buscarPorId(id);
        obj.setMedicamento(novo.getMedicamento());
        obj.setDosagem(novo.getDosagem());
        obj.setDuracaoDias(novo.getDuracaoDias());
        return repository.save(obj);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
