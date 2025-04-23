package com.foneLoan.foneLoanLiteJWT.entity;

import jakarta.persistence.*;

@Entity //to mark class as datasource
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn()
public class User {
    @Id
}
