package com.empresa.reagentes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class MovimentacaoEstoque {
    @Id
    private UUID id = UUID.randomUUID();
    private LocalDateTime dataHoraMovimentacao;
    private String tipo;
    private Integer quantidadeMovimentada;
    private String observacao;

    public MovimentacaoEstoque() {}

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public LocalDateTime getDataHoraMovimentacao() { return dataHoraMovimentacao; }
    public void setDataHoraMovimentacao(LocalDateTime dataHoraMovimentacao) { this.dataHoraMovimentacao = dataHoraMovimentacao; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Integer getQuantidadeMovimentada() { return quantidadeMovimentada; }
    public void setQuantidadeMovimentada(Integer quantidadeMovimentada) { this.quantidadeMovimentada = quantidadeMovimentada; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
}
