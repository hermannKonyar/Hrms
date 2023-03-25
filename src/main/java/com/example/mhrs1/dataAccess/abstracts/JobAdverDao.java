package com.example.mhrs1.dataAccess.abstracts;

import com.example.mhrs1.entities.concrtetes.JobAdver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdverDao extends JpaRepository<JobAdver,Integer> {

    List<JobAdver> getByStatusTrue();
    List<JobAdver> getByStatusTrueOrderByStartDateDesc();
    List<JobAdver> getByStatusTrueAndEmployer_CompanyName(String companyName);

    List<JobAdver> getByStatusFalse();
}
