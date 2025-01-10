package com.industry.bank.persistence.entity.customer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "BA01C1OCCUPATION")
public class OccupationEntity {

    private static final String SEQUENCE_NAME = "NGNQ_OCCUPATION_ID";

    @Id
    @SequenceGenerator(name = "OccupationEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "OccupationEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "BA005ID")
    private Long occupationId;

    @Column(name = "BA005CODE")
    private String occupationCode;

    @Column(name = "BA005NAME")
    private String occupationName;

}
