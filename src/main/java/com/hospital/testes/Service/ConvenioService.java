package com.hospital.testes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.testes.Model.Convenio;
import com.hospital.testes.Repository.ConvenioRepository;

import java.util.List;

@Service
public class ConvenioService {

    @Autowired
    private ConvenioRepository repository;

    public List<Convenio> listarTodos() {
        return repository.findAll();
    }

    public Convenio buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não encontrado"));
    }

    public Convenio salvar(Convenio obj) {
        return repository.save(obj);
    }

    public Convenio atualizar(Long id, Convenio novo) {
        Convenio obj = buscarPorId(id);
        obj.setNome(novo.getNome());
        obj.setCnpj(novo.getCnpj());
        return repository.save(obj);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}