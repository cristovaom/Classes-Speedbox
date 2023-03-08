package org.example.Entity;

import java.time.LocalDateTime;

public class Veiculo extends AbstractEntity{

    Modelo modelo;
    private String placa;
    private int ano;
    Cor cor;

    Usuario usuario;
    private Long km;

    Tipo tipo;

    public Veiculo(Modelo modelo, String placa, int ano, Cor cor, Usuario usuario, Long km, Tipo tipo) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.usuario = usuario;
        this.km = km;
        this.tipo = tipo;
    }

    public Veiculo(Long id, LocalDateTime cadastro, LocalDateTime edicao, boolean ativo, Modelo modelo, String placa, int ano, Cor cor, Usuario usuario, Long km, Tipo tipo) {
        super(id, cadastro, edicao, ativo);
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.usuario = usuario;
        this.km = km;
        this.tipo = tipo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getKm() {
        return km;
    }

    public void setKm(Long km) {
        this.km = km;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
