package com.foneLoan.foneLoanLiteJWT.repository;

import com.foneLoan.foneLoanLiteJWT.entity.SupportAgent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportAgentRepository extends JpaRepository<SupportAgent, String> {
    //if required custom methods will be added here
}
