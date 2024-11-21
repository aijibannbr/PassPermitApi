package com.example.passpermitapi.service;

import com.example.passpermitapi.model.PassPermit;
import com.example.passpermitapi.repository.PassPermitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassPermitService {
    private final PassPermitRepository repository;

    public PassPermitService(PassPermitRepository repository) {
        this.repository = repository;
    }

    public List<PassPermit> getAllPassPermits() {
        return repository.findAll();
    }

    public Optional<PassPermit> getPassPermitById(Long id) {
        return repository.findById(id);
    }

    public PassPermit createPassPermit(PassPermit passpermit) {
        return repository.save(passpermit);
    }

    public PassPermit updatePassPermit(Long id, PassPermit passpermit) {
        if (repository.existsById(id)) {
            passpermit.setId(id);
            return repository.save(passpermit);
        }
        return null;
    }

    public void deletePassPermit(Long id) {
        repository.deleteById(id);
    }
}
