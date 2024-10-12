package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;

@Entity
@Table(name = "lf1country")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
