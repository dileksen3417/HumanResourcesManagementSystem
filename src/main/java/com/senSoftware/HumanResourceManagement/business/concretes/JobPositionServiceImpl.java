package com.senSoftware.HumanResourceManagement.business.concretes;

import com.senSoftware.HumanResourceManagement.business.abstracts.JobPositionService;
import com.senSoftware.HumanResourceManagement.dataAccess.abstracts.JobPositionRepo;
import com.senSoftware.HumanResourceManagement.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionServiceImpl implements JobPositionService {
    @Autowired
    private JobPositionRepo jobPositionRepo;

    @Override
    public List<JobPosition> getAll() {
        return jobPositionRepo.findAll();
    }
}
