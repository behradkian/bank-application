package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;

@Entity
@Table(name = "lf1address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
