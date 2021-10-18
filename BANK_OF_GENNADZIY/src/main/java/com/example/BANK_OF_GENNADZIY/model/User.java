package com.example.BANK_OF_GENNADZIY.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user1")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;
    @Column
    private String email;
    @Column
    @JsonIgnore
    private boolean enabled;
    @Column
    @JsonIgnore
    private boolean tokenExpired;

}
