package com.example.mhrs1.dataAccess.abstracts;

import com.example.mhrs1.entities.concrtetes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}
