package com.example.mhrs1.dataAccess.abstracts;

import com.example.mhrs1.entities.concrtetes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
}
