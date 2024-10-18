package com.industry.bank.persistence.entity.location;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PBCOUNTRY")
public class CountryEntity {
    private static final String SEQUENCE_NAME = "NGNQ_COUNTRY_ID";

    @Id
    @SequenceGenerator(name = "CountryEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "CountryEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "PE007ID")
    private Long countryId;

    @Column(name = "PE007COD")
    private String countryCode;

    @Column(name = "PE007NAM")
    private String countryName;

    @JoinColumn(name = "PE006ID")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CityEntity> cities;

}
