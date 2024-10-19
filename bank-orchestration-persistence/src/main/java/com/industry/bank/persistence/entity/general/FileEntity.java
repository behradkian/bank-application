package com.industry.bank.persistence.entity.general;

import com.industry.bank.persistence.entity.customer.CustomerEntity;
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
@Table(name = "PBFILE")
public class FileEntity {

    private static final String SEQUENCE_NAME = "NGNQ_FILE_ID";

    @Id
    @SequenceGenerator(name = "FileEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "FileEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "PE011ID")
    private Long fileId;

    @Lob
    @Column(name = "PE011DATA")
    private byte[] fileData;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PE011DATE")
    private Date fileDate;

    @ManyToOne
    @JoinColumn(name = "PE005CUSTOMER_ID" , referencedColumnName = "customerId")
    private CustomerEntity customer;

}
