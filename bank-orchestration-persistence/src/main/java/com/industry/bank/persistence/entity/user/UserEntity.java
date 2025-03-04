package com.industry.bank.persistence.entity.user;

import com.industry.bank.persistence.entity.general.DegreeEntity;
import com.industry.bank.persistence.entity.general.AddressEntity;
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
@Table(name = "BA1USER")
public class UserEntity {

    private static final String SEQUENCE_NAME = "BA1USER_SEQ";

    @Id
    @Column(name = "BA1010ID")
    @SequenceGenerator(name = "UserEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(generator = "UserEntitySequenceGenerator", strategy = GenerationType.SEQUENCE)
    private Long userId;

    @Column(name = "BA1010FIRSNAM")
    private String firstName;

    @Column(name = "BA1010LSTNAM")
    private String lastName;

    @Column(name = "BA1010BIRTDAT")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @Column(name = "BA1010USRNAM")
    private String username;

    @Column(name = "BA1010USRPASS")
    private String password;

    @Column(name = "BA1010NATIONALCOD")
    private String nationalCode;

    @Column(name = "BA1010MOBNUM")
    private String mobileNumber;

    @Column(name = "BA1010MAIL")
    private String email;

    @Column(name = "BA1010ISUDAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;

    @Column(name = "BA1010ISACT")
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "PE009ID")
    private DegreeEntity degree;

    @JoinColumn(name = "PE005ID")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AddressEntity address;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_ROLE",
            joinColumns = @JoinColumn(name = "PE002ID"),
            inverseJoinColumns = @JoinColumn(name = "PE001ID")
    )
    private List<RoleEntity> roles;

}
