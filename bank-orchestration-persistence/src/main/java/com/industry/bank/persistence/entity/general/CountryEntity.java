package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PEG1COUNTRY")
public class CountryEntity {
    private static final String SEQUENCE_NAME = "NGNQ_COUNTRY_ID";

    @Id
    @SequenceGenerator(name = "CountryEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "CountryEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "BA006ID")
    private Long countryId;

    @Column(name = "BA006CODE")
    private String countryCode;

    @Column(name = "BA006NAME")
    private String countryName;

    @JoinColumn(name = "PE006ID")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CityEntity> cities;

}
