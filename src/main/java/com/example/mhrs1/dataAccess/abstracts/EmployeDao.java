package com.example.mhrs1.dataAccess.abstracts;

import com.example.mhrs1.entities.concrtetes.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeDao extends JpaRepository<Employe,Integer> {
}
