package com.industry.bank.persistence.entity.user;

import com.industry.bank.persistence.entity.customer.DegreeEntity;
import com.industry.bank.persistence.entity.location.AddressEntity;
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
@Table(name = "PEUSER")
public class UserEntity {

    private static final String SEQUENCE_NAME = "NGNQ_USER_ID";

    @Id
    @Column(name = "PE001ID")
    @SequenceGenerator(name = "UserEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "UserEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    private Long userId;

    @Column(name = "PE001FIRSNAM")
    private String firstName;

    @Column(name = "PE001LSTNAM")
    private String lastName;

    @Column(name = "PE001BIRTDAT")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @Column(name = "PE001USRNAM")
    private String username;

    @Column(name = "PE001USRPASS")
    private String password;

    @Column(name = "PE001NATIONALCOD")
    private String nationalCode;

    @Column(name = "PE001MOBNUM")
    private String mobileNumber;

    @Column(name = "PE001EMAIL")
    private String email;

    @Column(name = "PE001ISUDAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;

    @Column(name = "PE001EXPDAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expireDate;

    // use referenced name column input to join another column instead of id
//    @ManyToOne
//    @JoinColumn(name = "PE004ID" , referencedColumnName = "branchCode")
//    private BranchEntity branch;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_ROLE",
            joinColumns = @JoinColumn(name = "PE002ID"),
            inverseJoinColumns = @JoinColumn(name = "PE001ID")
    )
    private List<RoleEntity> roles;

    @ManyToOne
    @JoinColumn(name = "PE009ID")
    private DegreeEntity degree;


    @JoinColumn(name = "PE005ID")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AddressEntity> addresses;

}
