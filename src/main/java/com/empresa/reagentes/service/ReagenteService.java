package com.empresa.reagentes.service;

import com.empresa.reagentes.entity.Reagente;
import com.empresa.reagentes.repository.ReagenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ReagenteService {
    private final ReagenteRepository repo;

    public ReagenteService(ReagenteRepository repo) {
        this.repo = repo;
    }

    public Reagente create(Reagente r) {
        return repo.save(r);
    }

    public List<Reagente> findAll() {
        return repo.findAll();
    }

    public Optional<Reagente> findById(UUID id) {
        return repo.findById(id);
    }

    public Reagente update(UUID id, Reagente updated) {
        return repo.findById(id).map(r -> {
            r.setNome(updated.getNome());
            r.setCodigoSku(updated.getCodigoSku());
            r.setLote(updated.getLote());
            r.setDataValidade(updated.getDataValidade());
            r.setDataRecebimento(updated.getDataRecebimento());
            r.setQuantidadeEmEstoque(updated.getQuantidadeEmEstoque());
            r.setStatus(updated.getStatus());
            return repo.save(r);
        }).orElseThrow(() -> new RuntimeException("Reagente não encontrado"));
    }

    public void delete(UUID id) {
        repo.deleteById(id);
    }
}
