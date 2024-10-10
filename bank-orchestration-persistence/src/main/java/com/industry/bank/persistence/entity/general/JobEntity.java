package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;

@Entity
@Table(name = "jf1job")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
