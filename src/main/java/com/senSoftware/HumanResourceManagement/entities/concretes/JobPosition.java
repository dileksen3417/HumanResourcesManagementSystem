package com.senSoftware.HumanResourceManagement.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "position_name")
    private String positionName;

    public JobPosition() {
    }

    public JobPosition(long id, String positionName) {
        this.id = id;
        this.positionName = positionName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
