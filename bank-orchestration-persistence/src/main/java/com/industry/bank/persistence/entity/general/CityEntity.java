package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;

@Entity
@Table(name = "lf1city")
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
