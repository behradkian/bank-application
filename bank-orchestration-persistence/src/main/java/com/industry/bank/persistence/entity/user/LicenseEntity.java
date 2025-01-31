package com.industry.bank.persistence.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PEB3LICENSE")
public class LicenseEntity {

    private static final String SEQUENCE_NAME = "SEQ_LICENSE_ID";

    @Id
    @Column(name = "PE003ID")
    @SequenceGenerator(name = "LicenseEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "LicenseEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    private Long licenceId;

    @Column(name = "PE003COD")
    private int licenceCode;

    @Column(name = "PE003NAM")
    private String licenceName;

    @ManyToMany(mappedBy = "licenses")
    private List<RoleEntity> roles;

}
