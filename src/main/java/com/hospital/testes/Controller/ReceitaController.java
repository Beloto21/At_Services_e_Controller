package com.hospital.testes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.hospital.testes.Model.Receita;
import com.hospital.testes.Service.ReceitaService;

@RestController
@RequestMapping("/receita")
@CrossOrigin("*")
public class ReceitaController {

    @Autowired
    private ReceitaService service;

    @GetMapping
    public List<Receita> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Receita buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Receita salvar(@RequestBody Receita obj) {
        return service.salvar(obj);
    }

    @PutMapping("/{id}")
    public Receita atualizar(@PathVariable Long id, @RequestBody Receita obj) {
        return service.atualizar(id, obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}