package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/31
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PEG5NATIONALITY")
public class NationalityEntity {

    private static final String SEQUENCE_NAME = "SEQ_NATIONALITY_ID";

    @Id
    @SequenceGenerator(name = "NationalityEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "NationalityEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "BA006ID")
    private Long nationalityId;

    @Column(name = "BA006CODE")
    private String nationalityCode;

    @Column(name = "BA006NAME")
    private String nationalityName;

    @Column(name = "BA007DESC")
    private String nationalityDescription;

}
