package com.empresa.reagentes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class LocalizacaoEstoque {
    @Id
    private UUID id = UUID.randomUUID();
    private String codigoLocal;
    private String descricao;
    private String tipo;
    private String faixaTemperaturaNominal;
    private String setor;

    public LocalizacaoEstoque() {}

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCodigoLocal() { return codigoLocal; }
    public void setCodigoLocal(String codigoLocal) { this.codigoLocal = codigoLocal; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getFaixaTemperaturaNominal() { return faixaTemperaturaNominal; }
    public void setFaixaTemperaturaNominal(String faixaTemperaturaNominal) { this.faixaTemperaturaNominal = faixaTemperaturaNominal; }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
}
