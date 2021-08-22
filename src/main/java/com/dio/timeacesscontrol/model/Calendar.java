package com.dio.timeacesscontrol.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class Calendar {
    @GeneratedValue
    @Id
    private long id;
    @ManyToOne
    private DataType type;
    private String description;
    private LocalDateTime specialDate;

}
