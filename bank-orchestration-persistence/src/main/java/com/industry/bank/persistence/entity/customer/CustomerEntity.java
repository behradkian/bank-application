package com.industry.bank.persistence.entity.customer;

import com.industry.bank.api.enumeration.customer.CustomerType;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "BA1D1CUSTOMER")
public abstract class CustomerEntity {

    private static final String SEQUENCE_NAME = "NGNQ_CUSTOMER_ID";

    @Id
    @SequenceGenerator(name = "CustomerEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BA001ID")
    private Long id;

    @Column(name = "BA001CIF", unique = true, nullable = false)
    private String customerId;

    @EqualsAndHashCode.Include
    @Column(name = "BA001ISUDAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "BA001TYPE", nullable = false)
    private CustomerType customerType;

}