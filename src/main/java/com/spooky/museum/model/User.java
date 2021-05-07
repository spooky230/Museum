package com.spooky.museum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class User extends BaseEntity{
    private UserContacts userContact ;
    private String lastName;
    private String password;
}
