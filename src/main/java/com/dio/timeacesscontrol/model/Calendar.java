package com.dio.timeacesscontrol.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Value
@Builder
@Entity
public class Calendar {
    @Id
    private long id;
    @ManyToOne
    private DataType type;
    private String description;
    private LocalDateTime specialDate;

}
