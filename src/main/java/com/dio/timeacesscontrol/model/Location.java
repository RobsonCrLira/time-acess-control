package com.dio.timeacesscontrol.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Data
@Builder
@Entity
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @GeneratedValue( strategy =  GenerationType.AUTO)
    @Id
    private long id;
    @ManyToOne
    private LevelAccess levelAccess;
    private String description;
}
