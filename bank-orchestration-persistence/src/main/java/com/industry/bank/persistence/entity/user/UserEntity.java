package com.industry.bank.persistence.entity.user;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "of1user")
public class UserEntity {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private Date birthdate;
    private String username;
    private String password;
    @Temporal(TemporalType.DATE)
    private Date issueDate;
    @Temporal(TemporalType.DATE)
    private Date expireDate;
    private String emailAddress;
}
