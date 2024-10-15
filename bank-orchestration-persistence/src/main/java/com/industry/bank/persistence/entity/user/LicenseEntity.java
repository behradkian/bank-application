package com.industry.bank.persistence.entity.user;

import jakarta.persistence.*;

@Entity
@Table(name = "oc1license")
public class LicenseEntity {
    @Id
    @SequenceGenerator(
            name = "license_sequence",
            sequenceName = "license_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "license_sequence"
    )
    private Long id;
    private int code;
    private String name;
}
