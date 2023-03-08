package org.example.Entity;

import java.time.LocalDateTime;

public class Modelo extends AbstractEntity{
    private String nome;
    Marca marca;

    public Modelo(Long id, LocalDateTime cadastro, LocalDateTime edicao, boolean ativo, String nome, Marca marca) {
        super(id, cadastro, edicao, ativo);
        this.nome = nome;
        this.marca = marca;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
