package com.foneLoan.foneLoanLiteJWT.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("CUSTOMER") // Entity for Customer only . Our @DiscriminatorColumn is "role" , only role with
//"CUSTOMER" will be available here in this entity

public class Customer extends AUser {

    @Column(name = "credit_assigned" ,nullable = false )
    public Double creditAssigned = 10000.0;

    @Column(name = "credit_used" , nullable = false)
    public double creditUsed;

    @Column(name = "remaining_credit" , nullable = false)
    public double remainingCredit = creditAssigned - creditUsed;

    public Customer(String email, String firstName, String lastName, LocalDate dob, String password) {
        super(email, firstName, lastName, dob, password);
    }

    @Override
    public String getRole() {
        return "CUSTOMER";
    }
}
