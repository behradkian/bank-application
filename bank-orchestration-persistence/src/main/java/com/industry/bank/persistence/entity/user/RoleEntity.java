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
@Table(name = "PEROLE")
public class RoleEntity {

    private static final String SEQUENCE_NAME = "NGNQ_ROLE_ID";

    @Id
    @Column(name = "PE002ID")
    @SequenceGenerator(name = "RoleEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "RoleEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "PE002COD")
    private String code;

    @Column(name = "PE002NAM")
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<UserEntity> users;

    @ManyToMany
    @JoinTable(name = "ROLE_LICENSE",
            joinColumns = @JoinColumn(name = "PE003ID"),
            inverseJoinColumns = @JoinColumn(name = "PE002ID")
    )
    private List<LicenseEntity> licenses;

}
