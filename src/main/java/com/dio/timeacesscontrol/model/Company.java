package com.dio.timeacesscontrol.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Value
@Builder
@Entity
public class Company {
//    @GeneratedValue( strategy =  GenerationType.AUTO)
//    private UUID id;
    @Id
    private long id;
    private String description;
    private String cnpj;
    private String address;
    private String district;
    private String city;
    private String state;
    private String phone;
}
