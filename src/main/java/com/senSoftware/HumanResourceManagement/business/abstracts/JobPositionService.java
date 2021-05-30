package com.senSoftware.HumanResourceManagement.business.abstracts;

import com.senSoftware.HumanResourceManagement.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
}
