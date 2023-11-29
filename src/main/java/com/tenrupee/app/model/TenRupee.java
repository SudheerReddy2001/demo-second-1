package com.tenrupee.app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TenRupee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String pName;
    private String email;
}
