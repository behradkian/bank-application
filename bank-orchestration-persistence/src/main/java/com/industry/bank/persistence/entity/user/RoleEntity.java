package com.industry.bank.persistence.entity.user;

import jakarta.persistence.*;

@Entity
@Table(name = "oc1role")
public class RoleEntity {
    @Id
    @SequenceGenerator(
            name = "role_sequence",
            sequenceName = "role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "role_sequence"
    )
    private Long id;
    private int code;
    private String name;
}
