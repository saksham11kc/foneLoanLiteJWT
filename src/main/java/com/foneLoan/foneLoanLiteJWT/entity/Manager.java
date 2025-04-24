package com.foneLoan.foneLoanLiteJWT.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity @DiscriminatorValue("MANAGER")
public class Manager extends AUser {


    public Manager() {
        super();
    }

    public Manager(String email, String firstName, String lastName, LocalDate dob, String password) {
        super(email, firstName, lastName, dob, password);
    }



    @Override
    public String getRole() {
        return "MANAGER";
    }
}
