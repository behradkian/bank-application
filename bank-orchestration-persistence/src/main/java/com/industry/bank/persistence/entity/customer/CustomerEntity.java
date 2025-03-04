package com.industry.bank.persistence.entity.customer;

import com.industry.bank.api.enumeration.customer.CustomerType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Pedram Behradkian
 * @date : 2025/03/03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BA1CUSTOMER")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "BA1001TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class CustomerEntity {

    private static final String SEQUENCE_NAME = "BA1CUSTOMER_SEQ";

    @Id
    @SequenceGenerator(name = "CustomerEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BA1001ID")
    private Long customerId;

    @Enumerated(EnumType.STRING)
    @Column(name = "BA1001TYPE", nullable = false)
    private CustomerType customerType;

    @Column(name = "BA1001CIF", unique = true, nullable = false)
    private String customerNumber;

}