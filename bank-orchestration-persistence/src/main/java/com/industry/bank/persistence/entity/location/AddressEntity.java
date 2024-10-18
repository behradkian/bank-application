package com.industry.bank.persistence.entity.location;

import com.industry.bank.api.enumeration.general.AddressType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PBADDRESS")
public class AddressEntity {
    private static final String SEQUENCE_NAME = "NGNQ_ADDRESS_ID";

    @Id
    @SequenceGenerator(name = "AddressEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "AddressEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "PE005ID")
    private Long addressId;

    @ManyToOne
    @JoinColumn(name = "PE006ID")
    private CityEntity city;

    @Column(name = "PE005TYP")
    private AddressType addressType;

    @Column(name = "PE005POSTCOD")
    private String postalCode;

    @Column(name = "PE005PROVINCE")
    private String province;

    @Column(name = "PE005TOWN")
    private String townShip;

    @Column(name = "PE005VILLAGE")
    private String village;

    @Column(name = "PE005LOCALTYP")
    private String localityType;

    @Column(name = "PE005LOCALNAM")
    private String localityName;

    @Column(name = "PE005LOCALCOD")
    private String localityCode;

    @Column(name = "PE005SUBLOCAL")
    private String subLocality;

    @Column(name = "PE005ZONE")
    private String zone;

    @Column(name = "PE005STREET1")
    private String firstStreet;

    @Column(name = "PE005STREET2")
    private String secondStreet;

    @Column(name = "PE005BUILDNAM")
    private String buildingName;

    @Column(name = "PE005FLORNUM")
    private String floorNumber;

    @Column(name = "PE005FLORSID")
    private String sideFloor;

    @Column(name = "PE005HOUSENUM")
    private String houseNumber;

    @Column(name = "PE005TOTAL")
    private String totalAddress;

}
