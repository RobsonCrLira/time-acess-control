package com.dio.timeacesscontrol.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
@Entity
public class CompTime {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class CompTimeId implements Serializable{
        private long idCompTime;
        private long idMovement;
        private long idUser;
//        private String idUser;
    }

    @Id
    @EmbeddedId
    private CompTimeId id;
    private LocalDateTime dateWorked;
    private BigDecimal amountOfHours;
    private BigDecimal balance;
}
