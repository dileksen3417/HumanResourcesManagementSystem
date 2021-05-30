package com.senSoftware.HumanResourceManagement.dataAccess.abstracts;

import com.senSoftware.HumanResourceManagement.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionRepo extends JpaRepository<JobPosition, Long> {
}
