package com.example.passpermitapi.controller;

import com.example.passpermitapi.model.PassPermit;
import com.example.passpermitapi.service.PassPermitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pass-permit")
public class PassPermitController {
    private final PassPermitService service;

    public PassPermitController(PassPermitService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PassPermit> createPassPermit(@RequestBody PassPermit
                                                               passpermit) {
        return new ResponseEntity<>(service.createPassPermit(passpermit),
                HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<PassPermit> getAllPassPermits() {
        return service.getAllPassPermits();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PassPermit> getPassPermitById(@PathVariable Long
                                                                id) {
        return service.getPassPermitById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PassPermit> updatePassPermit(@PathVariable Long
                                                               id, @RequestBody PassPermit passpermit) {
        PassPermit updated = service.updatePassPermit(id, passpermit);
        return updated != null ? ResponseEntity.ok(updated) :
                ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePassPermit(@PathVariable Long id) {
        service.deletePassPermit(id);
        return ResponseEntity.noContent().build();
    }
}