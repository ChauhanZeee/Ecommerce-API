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
@Table(name = "order_model")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_model_user_id")
    private UserModel userModel;
    @ManyToOne
    @JoinColumn(name = "product_model_product_id")
    private ProductModel productModel;
    @ManyToOne
    @JoinColumn(name = "address_model_address_id")
    private AddressModel addressModel;
    @NotEmpty(message = "not be null")
    @Column(name = "product_quantity")
    private Integer quantity;
}
