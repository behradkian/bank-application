package com.industry.bank.persistence.entity.customer;

import com.industry.bank.persistence.entity.location.AddressEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PBREALCUSTOMER")
public class RealCustomerEntity {

    private static final String SEQUENCE_NAME = "NGNQ_REAL_CUSTOMER_ID";

    @Id
    @SequenceGenerator(name = "REALCustomerEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "REALCustomerEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "PE010ID")
    private Long realCustomerId;

    @Column(name = "PE010CIF")
    private String customerCode;

    @Column(name = "PE010NATCOD")
    private String nationalCode;

    @Column(name = "PE010FIRSNAM")
    private String firstName;

    @Column(name = "PE010LSTNAM")
    private String lastName;

    @Column(name = "PE010BIRTDAT")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @Column(name = "PE010MOBNUM")
    private String mobileNumber;

    @Column(name = "PE010EMAIL")
    private String email;

    @Column(name = "PE010ISUDAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;

    @ManyToOne
    @JoinColumn(name = "PE008ID")
    private OccupationEntity occupation;

    @ManyToOne
    @JoinColumn(name = "PE009ID")
    private DegreeEntity degree;


    @JoinColumn(name = "PE005ID")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AddressEntity> addresses;

}
