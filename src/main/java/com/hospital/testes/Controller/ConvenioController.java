package com.hospital.testes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.hospital.testes.Model.Convenio;
import com.hospital.testes.Service.ConvenioService;

@RestController
@RequestMapping("/Convenio")
@CrossOrigin("*")
public class ConvenioController {

    @Autowired
    private ConvenioService service;

    @GetMapping
    public List<Convenio> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Convenio buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Convenio salvar(@RequestBody Convenio obj) {
        return service.salvar(obj);
    }

    @PutMapping("/{id}")
    public Convenio atualizar(@PathVariable Long id, @RequestBody Convenio obj) {
        return service.atualizar(id, obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}