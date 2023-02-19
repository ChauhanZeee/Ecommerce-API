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
@Table(name = "address_model")
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;
    @NotEmpty(message = "not be null")
    @Column(name = "address_name")
    private String name;
    @NotEmpty(message = "not be null")
    @Column(name = "landmark")
    private String landmark;
    @NotEmpty(message = "not be null")
    @Column(name = "phone_no")
    private String phoneNo;
    @NotEmpty(message = "not be null")
    @Column(name = "zipcode")
    private String zipcode;
    @NotEmpty(message = "not be null")
    @Column(name = "state")
    private String state;
    @ManyToOne
    @JoinColumn(name = "address_user_model_id")
    private UserModel userModel;
}
