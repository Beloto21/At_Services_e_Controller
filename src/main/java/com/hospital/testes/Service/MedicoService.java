package com.hospital.testes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.testes.Model.Medico;
import com.hospital.testes.Repository.MedicoRepository;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    public List<Medico> listarTodos() {
        return repository.findAll();
    }

    public Medico buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não encontrado"));
    }

    public Medico salvar(Medico obj) {
        return repository.save(obj);
    }

    public Medico atualizar(Long id, Medico novo) {
        Medico obj = buscarPorId(id);
        obj.setNome(novo.getNome());
        obj.setEspecialidade(novo.getEspecialidade());
        obj.setCrm(novo.getCrm());
        return repository.save(obj);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}