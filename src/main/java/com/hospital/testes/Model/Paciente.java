package com.hospital.testes.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String telefone;

    // RELACIONAMENTO 1:1
    @OneToOne
    @JoinColumn(name = "prontuario_id")
    private Prontuario prontuario;

    // RELACIONAMENTO 1:N
    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    // GETTERS E SETTERS
    public Long getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public Prontuario getProntuario() { return prontuario; }
    public void setProntuario(Prontuario prontuario) { this.prontuario = prontuario; }

    public List<Consulta> getConsultas() { return consultas; }
    public void setConsultas(List<Consulta> consultas) { this.consultas = consultas; }
}
