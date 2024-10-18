package com.industry.bank.persistence.entity.location;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PBCITY")
public class CityEntity {

    private static final String SEQUENCE_NAME = "NGNQ_CITY_ID";

    @Id
    @SequenceGenerator(name = "CityEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "CityEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "PE006ID")
    private Long cityId;

    @Column(name = "PE006COD")
    private String cityCode;

    @Column(name = "PE006NAME")
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "PE007ID")
    private CountryEntity country;

}
