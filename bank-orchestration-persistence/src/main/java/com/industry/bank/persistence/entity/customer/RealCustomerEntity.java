package com.industry.bank.persistence.entity.customer;

import com.industry.bank.api.enumeration.general.GenderType;
import com.industry.bank.persistence.entity.general.AddressEntity;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "BA01C1REALCUSTOMER")
public class RealCustomerEntity {

    private static final String SEQUENCE_NAME = "NGNQ_REAL_CUSTOMER_ID";

    @Id
    @SequenceGenerator(name = "RealCustomerEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "RealCustomerEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "BA002ID")
    private Long realCustomerId;

    @Column(name = "BA002NATCOD", nullable = false)
    private String nationalCode;

    @Column(name = "BA002FRSTNAM")
    private String firstName;

    @Column(name = "BA002LSTNAM")
    private String lastName;

    @EqualsAndHashCode.Include
    @Column(name = "BA002BIRTDAT")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @Enumerated(EnumType.STRING)
    @Column(name = "BA002GENDER")
    private GenderType gender;

    @Column(name = "BA002MOBNUM")
    private String mobileNumber;

    @Column(name = "BA002EMAIL")
    private String email;

    @ManyToOne
    @JoinColumn(name = "BA004ID")
    private DegreeEntity degree;

    @ManyToOne
    @JoinColumn(name = "BA005ID")
    private OccupationEntity occupation;


    @JoinColumn(name = "PE005ID")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AddressEntity> addresses;

}