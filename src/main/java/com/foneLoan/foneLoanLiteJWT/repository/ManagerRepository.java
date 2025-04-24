package com.foneLoan.foneLoanLiteJWT.repository;

import com.foneLoan.foneLoanLiteJWT.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, String> {
    //if required custom methods will be added here
}
