package com.arbehr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Macroalgae {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 200, nullable = false)
    private String specie;

    @Column(length = 200, nullable = false)
    private String conspicuousness;

    @Column(length = 200, nullable = false)
    private String criteria_inv_other;

    @Column(length = 200, nullable = false)
    private String criteria_inv_spread;

    @Column(length = 200, nullable = false)
    private String distribution;

    @Column(length = 200, nullable = false)
    private String economic_ecological_impact;

    @Column(length = 200, nullable = false)
    private String origin;

    @Column(length = 200, nullable = false)
    private String studies;

    @Column(length = 200, nullable = false)
    private String vector;

    @Column(length = 200, nullable = false)
    private String reports;

    @Column(length = 200, nullable = false)
    private String origin_typeLoc;

    @Column(length = 50, nullable = false)
    private String status;
}
