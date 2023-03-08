package org.example.Entity;

import java.time.LocalDateTime;

public class Usuario extends AbstractEntity{
    private String email;
    private String usuario;
    private String senha;
    Cargo cargo;
    private String primeiroNome;
    private String sobrenome;
    private String cpf;
    Eventos eventos;

    public Usuario(String email, String usuario, String senha, Cargo cargo, String primeiroNome, String sobrenome, String cpf, Eventos eventos) {
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.cargo = cargo;
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.eventos = eventos;
    }

    public Usuario(Long id, LocalDateTime cadastro, LocalDateTime edicao, boolean ativo, String email, String usuario, String senha, Cargo cargo, String primeiroNome, String sobrenome, String cpf, Eventos eventos) {
        super(id, cadastro, edicao, ativo);
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.cargo = cargo;
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.eventos = eventos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }
}
