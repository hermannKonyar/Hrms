package com.example.mhrs1.dataAccess.abstracts;

import com.example.mhrs1.entities.concrtetes.JobAdver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAdverDao extends JpaRepository<JobAdver,Integer> {
}
