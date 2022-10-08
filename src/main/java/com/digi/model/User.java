package com.digi.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String name;
    @Column(name = "last_name")
    private String surname;
    private int age;
    private String email;
    private String password;
    @Column(name = "verification_code")
    private String verify;
}
