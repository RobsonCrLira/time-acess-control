package com.dio.timeacesscontrol.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@Audited
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
    @GeneratedValue
    @Id
    private long id;
    private String name;
    private String description;
}
