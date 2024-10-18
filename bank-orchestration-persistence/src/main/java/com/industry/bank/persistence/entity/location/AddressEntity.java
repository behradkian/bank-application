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
    @Column(name = "PE004ID")
    private Long addressId;

    @Column(name = "PE006ID")
    private Long cityId;

    @Column(name = "PE004TYP")
    private AddressType addressType;

    @Column(name = "PE004POSTCOD")
    private String postalCode;

    @Column(name = "PE004PROVINCE")
    private String province;

    @Column(name = "PE004TOWN")
    private String townShip;

    @Column(name = "PE004VILLAGE")
    private String village;

    @Column(name = "PE004LOCALTYP")
    private String localityType;

    @Column(name = "PE004LOCALNAM")
    private String localityName;

    @Column(name = "PE004LOCALCOD")
    private String localityCode;

    @Column(name = "PE004SUBLOCAL")
    private String subLocality;

    @Column(name = "PE004ZONE")
    private String zone;

    @Column(name = "PE004STREET1")
    private String firstStreet;

    @Column(name = "PE004STREET2")
    private String secondStreet;

    @Column(name = "PE004BUILDNAM")
    private String buildingName;

    @Column(name = "PE004FLORNUM")
    private String floorNumber;

    @Column(name = "PE004FLORSID")
    private String sideFloor;

    @Column(name = "PE004HOUSENUM")
    private String houseNumber;

    @Column(name = "PE004TOTAL")
    private String totalAddress;

}
