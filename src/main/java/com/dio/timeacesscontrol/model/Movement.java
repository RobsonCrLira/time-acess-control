package com.dio.timeacesscontrol.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
@Entity
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public  class MovementId implements Serializable {
        private long id;
        private long idUser;
//        private String idUser;
    }

    @Id
    @EmbeddedId
    private MovementId id;
    private LocalDateTime entryDate;
    private LocalDateTime exitDate;
    private BigDecimal period;
    @ManyToOne
    private Event event;
    @ManyToOne
    private Calendar calendar;

}
