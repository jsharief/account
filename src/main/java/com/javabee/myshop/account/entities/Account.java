package com.javabee.myshop.account.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account extends BaseEntity{

    String firstName;

    String lastName;

   // @Column(unique = true)
    String login;

    String password;

    boolean active;

    @OneToMany(fetch = FetchType.LAZY,orphanRemoval = true)
    Set<Address> addresses = new HashSet<>();


}
