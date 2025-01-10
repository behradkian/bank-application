package com.industry.bank.persistence.entity.customer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "BA01C1CORPCUSTOMER")
public class CorporateCustomerEntity {

    private static final String SEQUENCE_NAME = "NGNQ_CORPORATE_CUSTOMER_ID";

    @Id
    @SequenceGenerator(name = "CorporateCustomerEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "CorporateCustomerEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "BA003ID")
    private Long corporateCustomerId;

    @Column(name = "BA003NAME")
    private String name;


}
