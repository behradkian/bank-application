//package com.industry.bank.persistence.entity.customer;
//
//import com.industry.bank.persistence.entity.general.FileEntity;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.Date;
//import java.util.*;
//
//@Setter
//@Getter
//@NoArgsConstructor
//@Entity
//@Table(name = "PBCUSTOMER")
//public class CustomerEntity {
//    private static final String SEQUENCE_NAME = "NGNQ_CUSTOMER_ID";
//
//    @Id
//    @SequenceGenerator(name = "CustomerEntitySequenceGenerator", sequenceName = SEQUENCE_NAME, allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "PE0010ID")
//    private Long id;
//
//    @Column(name = "PE0010FIRSNAM")
//    private String firstName;
//
//    @Column(name = "PE0010LSTNAM")
//    private String lastName;
//
//    @Column(name = "PE0010FATHNAM")
//    private String fatherName;
//
//    @Column(name = "PE0010MOBNUM")
//    private String mobileNumber;
//
//    @Column(name = "PE0010PASSNUM")
//    private String passportNumber;
//
//    @Column(name = "PE0010NATCODE")
//    private String nationalCode;
//
//    @Column(name = "PE0010NAT")
//    private String nationality;
//
//    @Column(name = "PE0010BRTHDAT")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date birthdate;
//
//    @Column(name = "PE0010CITNAM")
//    private String cityName;
//
//    @Column(name = "PE0010PHNNUM")
//    private String phoneNumber;
//
//    @Column(name = "PE0010EMAIL")
//    private String email;
//
//    @Column(name = "PE0010GEN")
//    private String gender;
//
//    @Column(name = "PE0010JOB")
//    private String occupation;
//
//    @Column(name = "PE0010CUSID" , unique = true , nullable = false)
//    private String customerId;
//
//    @OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
//    private List<FileEntity> images;
//
//    @ManyToMany
//    @JoinTable(
//            name = "CUSTOMER_REFERRERS",
//            joinColumns = @JoinColumn(name = "customer_id"),
//            inverseJoinColumns = @JoinColumn(name = "referrer_id")
//    )
//    private Set<CustomerEntity> referrers = new HashSet<>();
//
//    @ManyToMany(mappedBy = "referrers")
//    private Set<CustomerEntity> referredCustomers = new HashSet<>();
//
//    // Convenience method to add a referrer
//    public void addReferrer(CustomerEntity referrer) {
//        referrers.add(referrer);
//        referrer.getReferredCustomers().add(this);  // Ensure bidirectional relationship
//    }
//
//    // Convenience method to remove a referrer
//    public void removeReferrer(CustomerEntity referrer) {
//        referrers.remove(referrer);
//        referrer.getReferredCustomers().remove(this);
//    }
//
//}
