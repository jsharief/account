package com.javabee.myshop.account.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address extends BaseEntity {

    String firstName;
    String lastName;
    String addressLine1;
    String getAddressLine2;
    String city;
    String state;
    String postalCode;
    // @Column(columnDefinition = "varchar default USA")
    String country;
    boolean defaultAddress;
    @ManyToOne
    @JoinColumn(name = "account_id")
    Account account;
}
