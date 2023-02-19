package com.geekster.Ecommerce.API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_model")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @NotEmpty(message = "not be null")
    @Column(name = "name")
    private String name;
    @NotEmpty(message = "not be null")
    @Column(name = "email")
    private String email;
    @NotEmpty(message = "not be null")
    @Column(name = "password")
    private String password;
    @NotEmpty(message = "not be null")
    @Column(name = "phone_no")
    private String phoneNo;
}
