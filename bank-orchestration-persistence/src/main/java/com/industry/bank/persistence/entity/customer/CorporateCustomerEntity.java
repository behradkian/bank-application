package com.industry.bank.persistence.entity.customer;

import com.industry.bank.persistence.entity.general.AddressEntity;
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
@Table(name = "BA1CORPCUSTOMER")
@DiscriminatorValue("CORPORATE")
public class CorporateCustomerEntity extends CustomerEntity {

    @Column(name = "BA1001NAM")
    private String name;

    @EqualsAndHashCode.Include
    @Column(name = "BA1001REGDAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;

    @Column(name = "BA1001REGCOD")
    private String registerCode;

    @Column(name = "BA1001MAIL")
    private String email;

    @JoinColumn(name = "PE005ID")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AddressEntity address;

}