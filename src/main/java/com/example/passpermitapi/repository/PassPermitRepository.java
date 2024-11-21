package com.example.passpermitapi.repository;

import com.example.passpermitapi.model.PassPermit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassPermitRepository extends JpaRepository<PassPermit,
        Long> {
}
