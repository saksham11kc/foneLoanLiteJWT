package com.foneLoan.foneLoanLiteJWT.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity //to mark class as datasource

@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // All entities in the Role inheritance hierarchy are stored in a single table
//SINGLE_TABLE is the fastest strategy to retrieve data(also has simple query for retrieving) with from the database followed by JOINED then TABLE_PER_CLASS

@DiscriminatorColumn(name ="role" , discriminatorType = DiscriminatorType.STRING)//denotes "role" column will differentiate record types
//discriminatorType tells Jpa  what will be the data type of discriminator column

@Data //Combines @Getter, @Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor

@NoArgsConstructor //Creates a no argument constructor

@AllArgsConstructor // Create a constructor with all argument
public abstract class AUser {
    @Id // marks primary key
    @Column(name = "email" , nullable = false , unique= true) // column is optional if name is the same
    private String email;


    @Column(name = "first_name" , nullable = false) // @Column annotation will store what will be in database column
    private String firstName;

    @Column(name = "last_name" , nullable = false)
    private String lastName;

    @Column(name = "dob")
    private LocalDate dob;

    // Allow incoming JSON to set this, but never output it
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password", nullable = false , length = 60)
    private String password;  // We use Bcrypt to store it in database.

    //Abstract method to force child to have this method
    public abstract String getRole();

}
