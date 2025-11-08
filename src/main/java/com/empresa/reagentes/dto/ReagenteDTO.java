package com.empresa.reagentes.dto;

import java.time.LocalDate;
import java.util.UUID;

public record ReagenteDTO(
    UUID id,
    String nome,
    String codigoSku,
    String lote,
    LocalDate dataValidade,
    LocalDate dataRecebimento,
    Integer quantidadeEmEstoque,
    String status,
    UUID fabricanteId,
    UUID localizacaoId
) {}
