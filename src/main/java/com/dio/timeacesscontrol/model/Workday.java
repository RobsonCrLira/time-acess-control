package com.dio.timeacesscontrol.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

//@aValue
@Data
@Builder
@Entity
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class Workday {
    @GeneratedValue
    @Id
    private long id;
    private String description;

}
