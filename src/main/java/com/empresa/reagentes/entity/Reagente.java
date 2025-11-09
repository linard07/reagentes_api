// Entidade principal do domínio de Reagentes
// Autor: Lucas Rodrigues

package com.empresa.reagentes.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "reagentes")
public class Reagente {
    @Id
    private UUID id = UUID.randomUUID();

    private String nome;

    @Column(unique = true)
    private String codigoSku;

    private String lote;

    private LocalDate dataValidade;
    private LocalDate dataRecebimento;
    private Integer quantidadeEmEstoque;

    @Enumerated(EnumType.STRING)
    private StatusReagente status;

    @ManyToOne(cascade = CascadeType.ALL)
    private Fabricante fabricante;

    @ManyToOne(cascade = CascadeType.ALL)
    private LocalizacaoEstoque localizacao;

    public Reagente() {}

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCodigoSku() { return codigoSku; }
    public void setCodigoSku(String codigoSku) { this.codigoSku = codigoSku; }

    public String getLote() { return lote; }
    public void setLote(String lote) { this.lote = lote; }

    public LocalDate getDataValidade() { return dataValidade; }
    public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }

    public LocalDate getDataRecebimento() { return dataRecebimento; }
    public void setDataRecebimento(LocalDate dataRecebimento) { this.dataRecebimento = dataRecebimento; }

    public Integer getQuantidadeEmEstoque() { return quantidadeEmEstoque; }
    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) { this.quantidadeEmEstoque = quantidadeEmEstoque; }

    public StatusReagente getStatus() { return status; }
    public void setStatus(StatusReagente status) { this.status = status; }

    public Fabricante getFabricante() { return fabricante; }
    public void setFabricante(Fabricante fabricante) { this.fabricante = fabricante; }

    public LocalizacaoEstoque getLocalizacao() { return localizacao; }
    public void setLocalizacao(LocalizacaoEstoque localizacao) { this.localizacao = localizacao; }
}
