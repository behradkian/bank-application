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
@Table(name = "PEB2ROLE")
public class RoleEntity {

    private static final String SEQUENCE_NAME = "SEQ_ROLE_ID";

    @Id
    @Column(name = "PE002ID")
    @SequenceGenerator(name = "RoleEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "RoleEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    private Long roleId;

    @Column(name = "PE002COD")
    private String roleCode;

    @Column(name = "PE002NAM")
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private List<UserEntity> users;

    @ManyToMany
    @JoinTable(name = "ROLE_LICENSE",
            joinColumns = @JoinColumn(name = "PE003ID"),
            inverseJoinColumns = @JoinColumn(name = "PE002ID")
    )
    private List<LicenseEntity> licenses;

}
