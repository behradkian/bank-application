package com.industry.bank.persistence.entity.customer;

import jakarta.persistence.*;

@Entity
@Table(name = "oc1customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
