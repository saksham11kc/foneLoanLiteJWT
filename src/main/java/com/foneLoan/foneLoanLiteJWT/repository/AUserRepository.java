package com.foneLoan.foneLoanLiteJWT.repository;

import com.foneLoan.foneLoanLiteJWT.entity.AUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Defines Repository bean
public interface AUserRepository  extends JpaRepository<AUser, String> {
        //if required custom methods will be added here
}
