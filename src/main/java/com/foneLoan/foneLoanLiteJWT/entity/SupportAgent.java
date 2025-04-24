package com.foneLoan.foneLoanLiteJWT.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("SUPPORT_AGENT")
public class SupportAgent extends AUser {

    public SupportAgent() {
        super();
    }

    public SupportAgent(String email, String firstName, String lastName, LocalDate dob, String password) {
        super(email, firstName, lastName, dob, password);
    }

    @Override
    public String getRole() {
        return "SUPPORT_AGENT";
    }
}
