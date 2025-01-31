package com.industry.bank.persistence.entity.general;

import com.industry.bank.api.enumeration.general.AddressType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "BA01C1ADDRESS")
public class AddressEntity {

    private static final String SEQUENCE_NAME = "SEQ_ADDRESS_ID";

    @Id
    @SequenceGenerator(name = "AddressEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "AddressEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "BA008ID")
    private Long addressId;

    @ManyToOne
    @JoinColumn(name = "BA007ID")
    private CityEntity city;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "BA008TYPE")
    private AddressType addressType;

    @Column(name = "BA008POSTCOD")
    private String postalCode;

    @Column(name = "BA008PROVINCE")
    private String province;

    @Column(name = "BA008TOWN")
    private String townShip;

    @Column(name = "BA008ZONE")
    private String zone;

    @Column(name = "BA008STREET1")
    private String firstStreet;

    @Column(name = "BA008STREET2")
    private String secondStreet;

    @Column(name = "BA008HOUSENUM")
    private String houseNumber;

    @Column(name = "BA008FLOOR")
    private String floorNumber;

    @Column(name = "BA008SIDFLOOR")
    private String sideFloor;

}