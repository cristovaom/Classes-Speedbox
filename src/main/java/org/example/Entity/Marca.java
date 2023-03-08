package org.example.Entity;

import java.time.LocalDateTime;

public class Marca extends AbstractEntity{
    private String nome;

    public Marca(String nome) {
        this.nome = nome;
    }

    public Marca(Long id, LocalDateTime cadastro, LocalDateTime edicao, boolean ativo, String nome) {
        super(id, cadastro, edicao, ativo);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
