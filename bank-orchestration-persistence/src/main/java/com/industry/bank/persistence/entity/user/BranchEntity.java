package com.industry.bank.persistence.entity.user;

import jakarta.persistence.*;

@Entity
@Table(name = "oc1branch")
public class BranchEntity {
    @Id
    @SequenceGenerator(
            name = "branch_sequence",
            sequenceName = "branch_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "branch_sequence"
    )
    private Long id;
    private int code;
    private String description;
    private String locationAddress;
}
