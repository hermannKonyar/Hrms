package com.example.mhrs1.dataAccess.abstracts;

import com.example.mhrs1.entities.concrtetes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
