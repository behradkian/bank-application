package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;

@Entity
@Table(name = "if1image")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
