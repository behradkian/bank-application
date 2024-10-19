package com.industry.bank.persistence.entity.customer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PBDEGREE")
public class DegreeEntity {

    private static final String SEQUENCE_NAME = "NGNQ_DEGREE_ID";

    @Id
    @SequenceGenerator(name = "DegreeEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "DegreeEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "PE009ID")
    private Long degreeId;

    @Column(name = "PE009COD")
    private String degreeCode;

    @Column(name = "PE009NAM")
    private String degreeName;

}
