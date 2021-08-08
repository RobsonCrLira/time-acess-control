package com.dio.timeacesscontrol.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Value
@Builder
@Entity
public class UserCategory {
    @Id
    private long id;
    private String description;
}
