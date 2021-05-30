package com.senSoftware.HumanResourceManagement.api.controllers;

import com.senSoftware.HumanResourceManagement.business.abstracts.JobPositionService;
import com.senSoftware.HumanResourceManagement.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {

    @Autowired
    private JobPositionService jobPositionService;

    @GetMapping("/getAll")
    public List<JobPosition> getAll(){
        return jobPositionService.getAll();
    }

}
