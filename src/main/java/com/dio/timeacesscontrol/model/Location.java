package com.dio.timeacesscontrol.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Value
@Builder
@Entity
public class Location {
    @Id
    private long id;
    @ManyToOne
    private LevelAccess levelAccess;
    private String description;
}
