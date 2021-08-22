package com.dio.timeacesscontrol.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class User {
//    private UUID id;
    @GeneratedValue
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
