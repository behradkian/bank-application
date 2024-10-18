package com.industry.bank.persistence.entity.general;

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
    @SequenceGenerator(name = "FileEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "FileEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "PE009ID")
    private Long degreeId;

    @Column(name = "PE009COD")
    private String jobCode;

    @Column(name = "PE009NAM")
    private String jobName;

}
