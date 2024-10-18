package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PBOCCUPATION")
public class OccupationEntity {

    private static final String SEQUENCE_NAME = "NGNQ_OCCUPATION_ID";

    @Id
    @SequenceGenerator(name = "OccupationEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "OccupationEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "PE008ID")
    private Long occupationId;

    @Column(name = "PE008COD")
    private String occupationCode;

    @Column(name = "PE008NAM")
    private String occupationName;

}
