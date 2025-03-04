package com.industry.bank.persistence.entity.general;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PEG2CITY")
public class CityEntity {

    private static final String SEQUENCE_NAME = "SEQ_CITY_ID";

    @Id
    @SequenceGenerator(name = "CityEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "CityEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "BA007ID")
    private Long cityId;

    @Column(name = "BA007CODE")
    private String cityCode;

    @Column(name = "BA007NAME")
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "BA006ID")
    private CountryEntity country;

}