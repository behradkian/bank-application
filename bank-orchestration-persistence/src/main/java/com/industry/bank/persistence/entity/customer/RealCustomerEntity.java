package com.industry.bank.persistence.entity.customer;

import com.industry.bank.api.enumeration.general.GenderType;
import com.industry.bank.persistence.entity.general.AddressEntity;
import com.industry.bank.persistence.entity.general.DegreeEntity;
import com.industry.bank.persistence.entity.general.NationalityEntity;
import com.industry.bank.persistence.entity.general.OccupationEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @author : Pedram Behradkian
 * @date : 2025/03/03
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "BA1REALCUSTOMER")
@DiscriminatorValue("REAL")
public class RealCustomerEntity extends CustomerEntity {

    @Column(name = "BA1001NATCOD", nullable = false)
    private String nationalCode;

    @Column(name = "BA1001FRSTNAM")
    private String firstName;

    @Column(name = "BA1001LSTNAM")
    private String lastName;

    @EqualsAndHashCode.Include
    @Column(name = "BA1001BIRTDAT")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @Enumerated(EnumType.STRING)
    @Column(name = "BA1001GENDER")
    private GenderType gender;

    @Column(name = "BA1001MOBNUM")
    private String mobileNumber;

    @Column(name = "BA1001MAIL")
    private String email;

    @JoinColumn(name = "BA1001NATNLTY")
    @OneToOne(cascade = CascadeType.ALL)
    private NationalityEntity nationality;

    @ManyToOne
    @JoinColumn(name = "BA004ID")
    private DegreeEntity degree;

    @ManyToOne
    @JoinColumn(name = "BA005ID")
    private OccupationEntity occupation;

    @JoinColumn(name = "PE005ID")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AddressEntity address;

}