package org.example.Entity;

import java.time.LocalDateTime;

public class Eventos extends AbstractEntity{
    TipoDeEvento tipoDeEvento;
    Usuario usuario;
    private LocalDateTime dataEvento;
    private String localPartida;
    private String localDestino;
    private String observacao;

    public Eventos(TipoDeEvento tipoDeEvento, Usuario usuario, LocalDateTime dataEvento, String localPartida, String localDestino, String observacao) {
        this.tipoDeEvento = tipoDeEvento;
        this.usuario = usuario;
        this.dataEvento = dataEvento;
        this.localPartida = localPartida;
        this.localDestino = localDestino;
        this.observacao = observacao;
    }

    public Eventos(Long id, LocalDateTime cadastro, LocalDateTime edicao, boolean ativo, TipoDeEvento tipoDeEvento, Usuario usuario, LocalDateTime dataEvento, String localPartida, String localDestino, String observacao) {
        super(id, cadastro, edicao, ativo);
        this.tipoDeEvento = tipoDeEvento;
        this.usuario = usuario;
        this.dataEvento = dataEvento;
        this.localPartida = localPartida;
        this.localDestino = localDestino;
        this.observacao = observacao;
    }

    public TipoDeEvento getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
