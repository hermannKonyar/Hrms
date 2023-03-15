package com.example.mhrs1.dataAccess.abstracts;

import com.example.mhrs1.entities.concrtetes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobPosition,Integer> {
}
