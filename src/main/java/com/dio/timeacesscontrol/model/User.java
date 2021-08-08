package com.dio.timeacesscontrol.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
@Entity
public class User {
//    @GeneratedValue( strategy =  GenerationType.AUTO)
//    private UUID id;
    @Id
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    private String name;
    @ManyToOne
    private Company company;
    @ManyToOne
    private LevelAccess levelAcess;
    @ManyToOne
    private Workday workday;
    private BigDecimal tolerance;
    private LocalDateTime startWork;
    private LocalDateTime endWork;
}
