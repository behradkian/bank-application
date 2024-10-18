package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PBJOB")
public class JobEntity {
    private static final String SEQUENCE_NAME = "NGNQ_JOB_ID";

    @Id
    @SequenceGenerator(name = "JobEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "JobEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "PE008ID")
    private Long jobId;

    @Column(name = "PE008COD")
    private String jobCode;

    @Column(name = "PE008NAM")
    private String jobName;

}
