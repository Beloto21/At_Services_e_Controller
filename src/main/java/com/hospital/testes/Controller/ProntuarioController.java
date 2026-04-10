package com.hospital.testes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.hospital.testes.Model.Prontuario;
import com.hospital.testes.Service.ProntuarioService;

@RestController
@RequestMapping("/prontuario")
@CrossOrigin("*")
public class ProntuarioController {

    @Autowired
    private ProntuarioService service;

    @GetMapping
    public List<Prontuario> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Prontuario buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Prontuario salvar(@RequestBody Prontuario obj) {
        return service.salvar(obj);
    }

    @PutMapping("/{id}")
    public Prontuario atualizar(@PathVariable Long id, @RequestBody Prontuario obj) {
        return service.atualizar(id, obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}