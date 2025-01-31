package com.industry.bank.persistence.entity.customer;

import com.industry.bank.api.enumeration.customer.DegreeType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "BA01C1DEGREE")
public class DegreeEntity {

    private static final String SEQUENCE_NAME = "SEQ_DEGREE_ID";

    @Id
    @SequenceGenerator(name = "DegreeEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "DegreeEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "BA004ID")
    private Long degreeId;

    @Column(name = "BA004CODE")
    private String degreeCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "BA004NAME")
    private DegreeType degreeName;

}