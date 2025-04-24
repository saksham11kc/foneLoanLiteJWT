package com.foneLoan.foneLoanLiteJWT.repository;

import com.foneLoan.foneLoanLiteJWT.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    //if required custom methods will be added here
}

