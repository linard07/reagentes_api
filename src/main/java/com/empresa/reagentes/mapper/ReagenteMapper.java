package com.empresa.reagentes.mapper;
// Código revisado e padronizado por Guilherme Linard
import com.empresa.reagentes.dto.ReagenteDTO;
import com.empresa.reagentes.entity.Reagente;

public class ReagenteMapper {
    public static ReagenteDTO toDTO(Reagente r) {
        if (r == null) return null;
        return new ReagenteDTO(
            r.getId(),
            r.getNome(),
            r.getCodigoSku(),
            r.getLote(),
            r.getDataValidade(),
            r.getDataRecebimento(),
            r.getQuantidadeEmEstoque(),
            r.getStatus() != null ? r.getStatus().name() : null,
            r.getFabricante() != null ? r.getFabricante().getId() : null,
            r.getLocalizacao() != null ? r.getLocalizacao().getId() : null
        );
    }
}
