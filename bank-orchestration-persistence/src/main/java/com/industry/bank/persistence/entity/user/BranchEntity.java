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
@Table(name = "PEBRANCH")
public class BranchEntity {

    private static final String SEQUENCE_NAME = "NGNQ_BRANCH_ID";

    @Id
    @Column(name = "PE004ID")
    @SequenceGenerator(name = "BranchEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "BranchEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "PE004COD")
    private String code;

    @Column(name = "PE004DESC")
    private String description;

    @Column(name = "PE001ID" , unique = true, nullable = false)
    private String branchCode;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY, cascade = CascadeType.ALL , orphanRemoval = true)
    private List<UserEntity> users;

}
