package com.arbehr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arbehr.model.Macroalgae;
import com.arbehr.repository.MacroalgaeRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/macroalgae")
@AllArgsConstructor
public class MacroalgaeController {

    private final MacroalgaeRepository macroalgaeRepository;

    @GetMapping
    public @ResponseBody List<Macroalgae> list() {
        return macroalgaeRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Macroalgae> get(@PathVariable Integer id) {
        return macroalgaeRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        macroalgaeRepository.deleteById(id);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Macroalgae macroalgae) {
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(macroalgaeRepository.save(macroalgae));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Macroalgae macroalgae) {
        return ResponseEntity.status(HttpStatus.OK)
            .body(macroalgaeRepository.save(macroalgae));
    }
}
