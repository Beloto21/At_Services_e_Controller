package com.hospital.testes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.hospital.testes.Model.Consulta;
import com.hospital.testes.Service.ConsultaService;

@RestController
@RequestMapping("/consulta")
@CrossOrigin("*")
public class ConsultaController {

    @Autowired
    private ConsultaService service;

    @GetMapping
    public List<Consulta> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Consulta buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Consulta salvar(@RequestBody Consulta obj) {
        return service.salvar(obj);
    }

    @PutMapping("/{id}")
    public Consulta atualizar(@PathVariable Long id, @RequestBody Consulta obj) {
        return service.atualizar(id, obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}