package com.industry.bank.persistence.api;

import com.industry.bank.persistence.entity.customer.RealCustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RealCustomerRepository extends JpaRepository<RealCustomerEntity, Long> {

    @Override
    RealCustomerEntity save(RealCustomerEntity entity);

    RealCustomerEntity findByRealCustomerId(Long realCustomerId);

    Optional<RealCustomerEntity> getByNationalCode(String nationalCode);
}