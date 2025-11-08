// Controller responsável por expor endpoints REST da entidade Reagente
// Autor: Lucas Vasquez
package com.empresa.reagentes.controller;

import com.empresa.reagentes.dto.ReagenteDTO;
import com.empresa.reagentes.entity.Reagente;
import com.empresa.reagentes.mapper.ReagenteMapper;
import com.empresa.reagentes.service.ReagenteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/reagentes")
public class ReagenteController {
    private final ReagenteService service;

    public ReagenteController(ReagenteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ReagenteDTO> create(@RequestBody Reagente reagente) {
        Reagente created = service.create(reagente);
        ReagenteDTO dto = ReagenteMapper.toDTO(created);
        return ResponseEntity.created(URI.create("/api/reagentes/" + created.getId())).body(dto);
    }

    @GetMapping
    public ResponseEntity<List<ReagenteDTO>> listAll() {
        List<ReagenteDTO> dtos = service.findAll().stream().map(ReagenteMapper::toDTO).collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReagenteDTO> getById(@PathVariable UUID id) {
        return service.findById(id)
                .map(r -> ResponseEntity.ok(ReagenteMapper.toDTO(r)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReagenteDTO> update(@PathVariable UUID id, @RequestBody Reagente updated) {
        try {
            Reagente u = service.update(id, updated);
            return ResponseEntity.ok(ReagenteMapper.toDTO(u));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
