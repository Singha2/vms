package com.vertisage.vms.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(collection = "visitor")
public class Visitor {
    @Id
    private @NotNull String id;
    private @NotNull String firstName;
    private @NotNull String lastName;
    @Indexed(direction = IndexDirection.ASCENDING)
    private @NotNull String mobileNumber;
    private @NotNull String email;

    public Visitor(){

    }

    public Visitor(@NotNull String firstName,
                   @NotNull String lastName,
                   @NotNull String mobileNumber,
                   @NotNull String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }
}
