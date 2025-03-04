package com.industry.bank.persistence.api;

import com.industry.bank.persistence.entity.customer.RealCustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealCustomerRepository extends JpaRepository<RealCustomerEntity, Long> {

    RealCustomerEntity findByRealCustomerId(Long realCustomerId);

}