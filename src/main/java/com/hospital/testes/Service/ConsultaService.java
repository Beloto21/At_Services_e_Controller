package com.hospital.testes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.testes.Model.Consulta;
import com.hospital.testes.Repository.ConsultaRepository;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository repository;

    public List<Consulta> listarTodos() {
        return repository.findAll();
    }

    public Consulta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não encontrado"));
    }

    public Consulta salvar(Consulta obj) {
        return repository.save(obj);
    }

    public Consulta atualizar(Long id, Consulta novo) {
        Consulta obj = buscarPorId(id);
        obj.setDataHora(novo.getDataHora());
        obj.setMotivo(novo.getMotivo());
        obj.setValor(novo.getValor());
        return repository.save(obj);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}