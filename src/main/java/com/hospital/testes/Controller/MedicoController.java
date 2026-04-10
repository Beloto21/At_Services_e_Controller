package com.hospital.testes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.hospital.testes.Model.Medico;
import com.hospital.testes.Service.MedicoService;

@RestController
@RequestMapping("/medico")
@CrossOrigin("*")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @GetMapping
    public List<Medico> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Medico buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Medico salvar(@RequestBody Medico obj) {
        return service.salvar(obj);
    }

    @PutMapping("/{id}")
    public Medico atualizar(@PathVariable Long id, @RequestBody Medico obj) {
        return service.atualizar(id, obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}